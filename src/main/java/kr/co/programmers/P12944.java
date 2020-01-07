package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 */
public class P12944 {
    public double solution(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }

        return (double) sum / arr.length;
    }
}
