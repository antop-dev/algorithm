package kr.co.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12913
public class P12913 {
    int solution(int[][] land) {
        int ans = 0;
        for (int i = 1; i < land.length; i++) {
            int[] prev = land[i - 1];
            int[] curr = land[i];
            curr[0] += max(prev[1], prev[2], prev[3]);
            curr[1] += max(prev[0], prev[2], prev[3]);
            curr[2] += max(prev[0], prev[1], prev[3]);
            curr[3] += max(prev[0], prev[1], prev[2]);
            ans = max(curr[0], curr[1], curr[2], curr[3]);
        }
        return ans;
    }

    private int max(int... values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}
