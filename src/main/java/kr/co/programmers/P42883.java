package kr.co.programmers;

import java.util.Arrays;

public class P42883 {
    public String solution(String number, int k) {
        System.out.println();
        System.out.println("number = " + number);
        System.out.println("k = " + k);

        int numberSize = number.length() - k;
        char[] array = new char[numberSize];

        int pos = 0;
        int idx = 0;
        while (numberSize > 0) {
            char max = '0';
            int end = number.length() - numberSize;

            System.out.println();
            System.out.println("search index = " + pos + " ~ " + end);

            for (int i = pos; i <= end; i++) {
                if (number.charAt(i) > max) {
                    max = number.charAt(i);
                    pos = i;
                }
            }

            pos++;
            numberSize--;
            array[idx++] = max;

            System.out.println("array = " + Arrays.toString(array));
        }

        return new String(array);
    }
}
