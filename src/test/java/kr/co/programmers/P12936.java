package kr.co.programmers;

import java.util.ArrayList;

// https://github.com/antop-dev/algorithm/issues/578
public class P12936 {
    public int[] solution(int n, long k) {
        k--; // 0-indexed

        var factorial = 1L;
        var nums = new ArrayList<Integer>();
        // 숫자 리스트 초기화 및 (n-1)! 계산
        for (int i = 1; i <= n; i++) {
            nums.add(i);
            if (i < n) {
                factorial *= i;
            }
        }

        // 순열 생성
        var ans = new int[n];
        var anchor = 0;
        for (int i = n - 1; i >= 1; i--) {
            int index = (int) (k / factorial);
            ans[anchor++] = nums.remove(index);
            k %= factorial;
            factorial /= i;
        }
        // 마지막 남은 숫자 추가
        ans[anchor] = nums.get(0);

        return ans;
    }

}
