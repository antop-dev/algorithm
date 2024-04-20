package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/552
public class P12938 {
    public int[] solution(int n, int s) {
        // 최고의 집합이 존재하지 않는 경우
        if (s < n) {
            return new int[]{-1};
        }

        int quotient = s / n;
        int remainder = s % n;

        int[] ans = new int[n];
        // 최고의 집합은 오름차순으로 정렬
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = quotient;
            if (remainder-- > 0) {
                ans[i] += 1;
            }
        }
        return ans;
    }
}
