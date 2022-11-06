package kr.co.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P131128 {
    public String solution(String X, String Y) {
        List<Character> chars = new ArrayList<>();
        char[] xs = X.toCharArray();
        char[] ys = Y.toCharArray();
        int j = Y.length() - 1;
        // 정렬 후 뒤에서부터 탐색하여 자동으로 큰 짝꿍 수를 먼저 찾는다.
        Arrays.sort(xs);
        Arrays.sort(ys);
        // 짝꿍 찾기
        loop:
        for (int i = xs.length - 1; i >= 0; i--) {
            for (int k = j; k >= 0; k--) {
                if (xs[i] == ys[k]) {
                    chars.add(xs[i]);
                    j = k - 1;
                    continue loop;
                }
            }
        }
        // 짝꿍이 존재하지 않을 경우.
        if (chars.isEmpty()) {
            return "-1";
        }
        // 숫자 만들기
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (sb.length() == 0 && c == '0') {
                // '0'으로 시작하는 경우 제외
                continue;
            }
            sb.append(c);
        }
        // 길이가 0이면 짝꿍이 전부 '0'
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
