package com.example.moodo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.moodo.databinding.ActivityMainBinding
import com.example.moodo.databinding.DialogLoginBinding
import com.example.moodo.db.MooDoClient
import com.example.moodo.db.MooDoUser
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 로그인 버튼 처리
        binding.signInBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity_SignIn::class.java)
            startActivity(intent)
        }

        // 회원가입 버튼 처리
        binding.signUpBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity_SignUp::class.java)

            startActivity(intent)
        }

        // 개발용 버튼, 로그인 자동
        binding.testBtn.setOnClickListener {
            val id = "testUser1"
            val pw = "newPassword1231"

            val loginUser = MooDoUser(id, pw, null, null)
            MooDoClient.retrofit.login(loginUser).enqueue(object:retrofit2.Callback<MooDoUser>{
                override fun onResponse(call: Call<MooDoUser>, response: Response<MooDoUser>) {
                    if (response.isSuccessful) {
                        // main Page 이동
                        val intent = Intent(this@MainActivity, MainActivity_MooDo::class.java)
                        intent.putExtra("id", id)
                        startActivity(intent)
                    }
                    // 로그인 실패
                    else {
                        AlertDialog.Builder(binding.root.context)
                            .setMessage("아이디와 비밀번호를 확인하세요.")
                            .setPositiveButton("확인", null)
                            .show()
                    }
                }

                override fun onFailure(call: Call<MooDoUser>, t: Throwable) {
                    Log.d("MooDoLog Login Fail", t.toString())
                }
            })
        }
    }
}