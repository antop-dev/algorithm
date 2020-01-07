package kr.co.programmers;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 */
public class P12933 {
    public long solution(long n) {
        int l = (int) (Math.log10(n) + 1); // 숫자의 자리수
        int[] array = new int[l];
        // 배열로 변환
        for (int i = 0; i < l; i++) {
            System.out.println("n = " + n);
            array[i] = (int) (n % 10);
            System.out.println("array = " + Arrays.toString(array));
            n /= 10;
        }
        // 정렬
        Arrays.sort(array);
        System.out.println("sort   = " + Arrays.toString(array));
        // 수로 만듬
        long answer = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            answer += array[i] * Math.pow(10, i);
        }

        return answer;
    }
}
