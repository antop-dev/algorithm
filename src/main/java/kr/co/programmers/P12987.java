package kr.co.programmers;

import java.util.Arrays;

// https://github.com/antop-dev/algorithm/issues/624
public class P12987 {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int ans = 0;
        int i = 0;
        for (int b : B) {
            if (A[i] < b) {
                i++;
                ans++;
            }
        }
        return ans;
    }
}
