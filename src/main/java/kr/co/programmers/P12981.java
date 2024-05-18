package kr.co.programmers;

import java.util.HashSet;
import java.util.Set;

// https://github.com/antop-dev/algorithm/issues/16
public class P12981 {
    public int[] solution(int n, String[] words) {
        Set<String> history = new HashSet<>();
        char prev = words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (prev != word.charAt(0) || !history.add(word)) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            prev = word.charAt(word.length() - 1);
        }
        return new int[]{0, 0};
    }
}
