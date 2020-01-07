package kr.co.programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class P12906 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int b = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.println("b = " + b);

            int n = arr[i];
            if (b != n) { // 숫자가 바뀌었을 경우
                list.add(n);
            }
            b = n;

            System.out.println("n = " + n);
            System.out.println("list = " + list);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
