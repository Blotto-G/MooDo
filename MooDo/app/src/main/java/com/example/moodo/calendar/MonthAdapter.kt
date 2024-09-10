package com.example.moodo.calendar

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moodo.R
import com.example.moodo.databinding.ItemListMonthBinding
import com.example.moodo.db.MooDoClient
import retrofit2.Call
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class MonthAdapter(val userId: String) : RecyclerView.Adapter<MonthAdapter.MonthHolder>() {
    val center = Int.MAX_VALUE / 2
    private var calendar = Calendar.getInstance()
    val today = calendar.time

    var dayAdapter: DayAdapter? = null

    // interface
    interface OnDaySelectedListener {
        fun onDaySelected(date: String)
    }
    var onDaySelectedListener: OnDaySelectedListener? = null

    inner class MonthHolder(val binding: ItemListMonthBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthHolder {
        return MonthHolder(ItemListMonthBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return Int.MAX_VALUE
    }

    override fun onBindViewHolder(holder: MonthHolder, position: Int) {
        calendar.time = Date() // 오늘 날짜로 초기화
        calendar.set(Calendar.DAY_OF_MONTH, 1)
        calendar.add(Calendar.MONTH, position - center)

        // Month 표시
        holder.binding.itemMonthTxt.text = "${calendar.get(Calendar.YEAR)}년 ${calendar.get(Calendar.MONTH) + 1}월"

        val tempMonth = calendar.get(Calendar.MONTH)

        // 6주 * 7일 날짜 리스트 생성
        val dayList: MutableList<Date> = MutableList(6 * 7) { Date() }
        val tempCalendar = calendar.clone() as Calendar // 임시 캘린더로 날짜 계산
        tempCalendar.add(Calendar.DAY_OF_MONTH, -(tempCalendar.get(Calendar.DAY_OF_WEEK) - 1)) // 첫 주의 일요일로 이동

        var todayPosition = -1 // 현재 날짜의 위치를 저장할 변수

        for (i in 0 until 6) {
            for (k in 0 until 7) {
                dayList[i * 7 + k] = tempCalendar.time

                // 오늘 날짜와 일치하는 포지션을 찾음
                if (SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(tempCalendar.time) == SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(today)) {
                    todayPosition = i * 7 + k
                }

                tempCalendar.add(Calendar.DAY_OF_MONTH, 1) // 하루씩 증가
            }
        }

        dayAdapter = DayAdapter(tempMonth, dayList, todayPosition, userId).apply {
            clickItemDayListener = object : DayAdapter.ClickItemDayListener {
                override fun clickItemDay(position: Int) {
                    // 클릭된 날짜 처리 및 이벤트 전달
                    val selectedDay = dayList[position]
                    val formattedDate = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(selectedDay)
                    onDaySelectedListener?.onDaySelected(formattedDate)
                }
            }
        }

        holder.binding.itemMonthDayList.layoutManager = GridLayoutManager(holder.binding.root.context, 7)
        holder.binding.itemMonthDayList.adapter = dayAdapter
    }
}