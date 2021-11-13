package kr.co.programmers;

import java.util.Arrays;
import java.util.Comparator;

// https://github.com/antop-dev/algorithm/issues/347
public class P42884 {
    public int solution(int[][] routes) {
        // 진입 지점 기준으로 정렬
        Arrays.sort(routes, Comparator.comparingInt(o -> o[0]));

        int answer = 1;
        int standard = routes[0][1]; // 진출 지점

        for (int[] route : routes) {
            if (standard >= route[0]) { // 현재 차량의 진입이 전 차량의 진출보다 앞이면
                standard = Math.min(route[1], standard);
            } else { // 현재 차량의 진입이 전 차량의 이동에 포함되지 않으면
                answer++;
                standard = route[1];
            }
        }

        return answer;
    }
}
