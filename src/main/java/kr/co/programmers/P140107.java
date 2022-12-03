package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/439
public class P140107 {

    public long solution(int k, int d) {
        long sum = 0;
        for (int x = 0; x <= d; x += k) {
            int y = y(d, x);
            sum += y / k + 1;
        }

        return sum;
    }

    // 피타고리스의 정리
    private int y(int d, int x) {
        long dd = (long) Math.pow(d, 2);
        long xx = (long) Math.pow(x, 2);
        return (int) Math.sqrt(dd - xx);
    }

}
