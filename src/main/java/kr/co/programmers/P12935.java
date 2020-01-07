package kr.co.programmers;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 */
public class P12935 {
    public int[] solution(int[] arr) {
        System.out.println("arr = " + Arrays.toString(arr));

        // 배열의 크기가 1이면 바로 리턴
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 가장 작은 수를 찾는다.
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min = " + min);

        // 가장 작은 수가 아닌 수의 개수를 구한다.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                count++;
            }
        }

        System.out.println("count = " + count);

        // 가장 작은 수를 제외한 수를 배열로 담아서 리턴
        int[] answer = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                answer[j++] = arr[i];
            }
        }

        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }
}
