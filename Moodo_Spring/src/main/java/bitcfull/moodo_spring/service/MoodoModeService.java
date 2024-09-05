package bitcfull.moodo_spring.service;

import bitcfull.moodo_spring.MoodoSpringApplication;
import bitcfull.moodo_spring.model.MoodoMode;
import bitcfull.moodo_spring.repository.ModeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class MoodoModeService {

    @Autowired
    private ModeRepository modeRepository;
    @Autowired
    private MoodoSpringApplication moodoSpringApplication;

    // 기분 기록 추가
    public MoodoMode insert(MoodoMode mood) {
        return modeRepository.save(mood);
    }

    // 기분 기록 삭제
    public void delete(Long id) {
        modeRepository.deleteById(id);
    }

    // 특정 기분 기록 조회
    public Optional<MoodoMode> findById(Long id) {
        return modeRepository.findById(id);
    }

    // 특정 유저 기분 기록 조회
    public List<MoodoMode> findByUserId(String userId) {
        return modeRepository.findByUserId(userId);
    }

    // 특정 날짜의 유저 기분 기록 조회(이모지 삽입 위해서 필요?)
    public Optional<MoodoMode> findByUserAndDate(String userId, LocalDate createdDate) {
        return modeRepository.findByUserIdAndCreatedDate(userId, createdDate);
    }

    // 기분 기록 수정
    @Transactional
    public MoodoMode update(Long id, MoodoMode mood) {
        MoodoMode m = modeRepository.findById(id).get();

        m.setMdMode(mood.getMdMode());

        return m;
    }

    // 유저별 매월 가장 많이 기록된 기분 값 조회
    public Integer findMoodMax(String userId) {
        // 조회일 기준 당월
        YearMonth currentMonth = YearMonth.now();
        // 당월 1일
        LocalDate startMonth = currentMonth.atDay(1);
        // 조회일
        LocalDate endMonth = LocalDate.now();

        // 조회일 기준 당월 1일부터 조회일까지 가장 많은 기분값 조회
        List<Object[]> result = modeRepository.findMoodMax(userId, startMonth, endMonth);

        // 기분값, 빈도수 Map에서 키값(기분값) 반환
        Map<Integer, Long> moodCounts = new HashMap<>();
        for (Object[] row : result) {
            Integer mood = (Integer) row[0];
            Long count = (Long) row[1];
            moodCounts.put(mood, count);
        }

        Integer moodMax = null;
        Long maxCount = 0L;

        for (Map.Entry<Integer, Long> entry : moodCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                moodMax = entry.getKey();
            }
        }
        return moodMax;
    }
}