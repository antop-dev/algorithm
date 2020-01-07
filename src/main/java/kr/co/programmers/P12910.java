package kr.co.programmers;

import java.util.Arrays;

public class P12910 {
    public int[] solution(int[] arr, int divisor) {
        int c = arr.length; // 나누어 떨어지는 수의 갯수
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor != 0) { // 나누어 떨어지지 않는 경우
                c--;
                arr[i] = -1; // 배열의 값을 -1로 변경한다.
            }
        }

        System.out.println("c = " + c);
        System.out.println("arr = " + Arrays.toString(arr));

        if (c == 0) { // 나누어 떨어지는 수가 하나도 없을 경우
            return new int[]{-1};
        }

        // 나누어 떨어지는 수만 뽑아낸다.
        int[] answer = new int[c];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                answer[j] = arr[i];
                j++;
            }
        }
        // 정렬
        Arrays.sort(answer);

        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }

}
