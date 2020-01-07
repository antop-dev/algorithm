package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 */
public class P12947 {
    public boolean solution(int x) {
        int y = x;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return y % sum == 0;
    }
}
