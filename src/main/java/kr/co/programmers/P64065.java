package kr.co.programmers;

import java.util.HashMap;
import java.util.Map;

// https://github.com/antop-dev/algorithm/issues/413
public class P64065 {

    public int[] solution(String s) {
        // 숫자 : 횟수
        Map<Integer, Integer> map = new HashMap<>();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = (n * 10) + Character.getNumericValue(c);
            } else if (n > 0) {
                map.put(n, map.getOrDefault(n, 0) + 1);
                n = 0;
            }
        }

        int size = map.size();
        int[] answer = new int[size];
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            answer[size - e.getValue()] = e.getKey();
        }

        return answer;
    }

}
