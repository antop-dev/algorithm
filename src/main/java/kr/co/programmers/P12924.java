package kr.co.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class P12924 {
    public int solution(int n) {
        int ans = 0;

        int sum = 1;
        int l = 1;
        int r = 1;
        while (l <= n) {
            if (sum == n) {
                ans++;
            }
            if (n <= sum) {
                sum -= l;
                l++;
            } else { // n > sum
                r++;
                sum += r;
            }
        }

        return ans;
    }
}
