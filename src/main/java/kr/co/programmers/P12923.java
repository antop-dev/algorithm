package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/601
public class P12923 {
    public int[] solution(long begin, long end) {
        int len = (int) (end - begin + 1);
        int[] ans = new int[len];
        for (long n = begin; n <= end; n++) {
            ans[(int) (n - begin)] = calc(n);
        }
        return ans;
    }

    private int calc(long n) {
        if (n == 1) {
            return 0;
        }
        long max = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                max = i;
                if (n / i <= 10_000_000L) {
                    return (int) (n / i);
                }
            }
        }
        return (int) max;
    }
}
