package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12934
 */
public class P12934 {
    public long solution(long n) {
        // 수소점이 있으면 제곱이 아니다.
        double sqrt = Math.sqrt(n);
        // double을 int로 형변환하면 소수점이 버려지는 특성을 이용
        return sqrt == (int) sqrt ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
