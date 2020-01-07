package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 */
public class P12940 {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n, m), lcm(n, m)};
    }

    /**
     * 최대 공약수
     *
     * @param a
     * @param b
     * @return
     */
    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    /**
     * 취소 공배수
     *
     * @param a
     * @param b
     * @return
     */
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
