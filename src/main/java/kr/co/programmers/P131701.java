package kr.co.programmers;

import java.util.HashSet;
import java.util.Set;

// https://github.com/antop-dev/algorithm/issues/448
public class P131701 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = 0; j < len; j++) {
                sum += elements[(i + j) % len];
                set.add(sum);
            }
        }
        return set.size();
    }

}
