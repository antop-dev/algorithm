package kr.co.programmers;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class P42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int l = 0; l < commands.length; l++) {
            int[] command = commands[l];
            int i = command[0] - 1;
            int j = command[1];
            int k = command[2] - 1;
            // 배열 복사
            int[] copy = Arrays.copyOfRange(array, i, j);
            // 정렬
            Arrays.sort(copy);

            System.out.println();
            System.out.println("i(index) = " + i + ", j = " + j + ", k(index) = " + k);
            System.out.println(Arrays.toString(array) + " → copy → " + Arrays.toString(copy));
            System.out.println("copy[" + k + "] = " + copy[k]);
            // K번째 수
            answer[l] = copy[k];
        }

        return answer;
    }

}
