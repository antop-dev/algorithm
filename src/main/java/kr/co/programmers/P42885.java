package kr.co.programmers;

import java.util.Arrays;

// https://github.com/antop-dev/algorithm/issues/572
public class P42885 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int i = 0; // 가벼운 사람 포인터
        int j = n - 1; // 무거운 사람 포인터
        while (i < j) {
            // 가벼운 사람 + 무거운 사람 : i++, j--
            // 무거운 사람 : j--
            if (people[i] + people[j--] <= limit) {
                i++;
            }
        }
        return n - i;
    }
}
