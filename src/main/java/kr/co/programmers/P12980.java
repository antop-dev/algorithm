package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/581
public class P12980 {
    public int solution(int n) {
        int ans = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }
        return ans;
    }
}
