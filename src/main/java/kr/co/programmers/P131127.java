package kr.co.programmers;

import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/131127
public class P131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        // 이 값이 양수면 모자란거다.
        int score = 0;
        // 제품의 인덱스 맵
        Map<String, Integer> pointer = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            pointer.put(want[i], i);
            score += number[i];
        }
        // 1 ~ 10일 먼저 계산
        int index = 0;
        while (index < 10) {
            String dis = discount[index];
            if (pointer.containsKey(dis)) {
                int k = pointer.get(dis);
                number[k]--;
                if (number[k] >= 0) {
                    score--;
                }
            }
            index++;
        }
        if (score == 0) {
            answer++;
        }
        // 11일 째부터 계산
        while (index < discount.length) {
            // 빠지는 날 : 현재일 - 10일
            String prev = discount[index - 10];
            if (pointer.containsKey(prev)) {
                int k = pointer.get(prev);
                number[k]++;
                if (number[k] > 0) {
                    score++;
                }
            }
            // 들어오는 날 : 현재일
            String next = discount[index];
            if (pointer.containsKey(next)) {
                int k = pointer.get(next);
                number[k]--;
                if (number[k] >= 0) {
                    score--;
                }
            }
            // 빠지는 물건과 들어오는 물건을 계산 했을 때도 0이면 만족
            if (score == 0) {
                answer++;
            }
            index++;
        }

        return answer;
    }
}
