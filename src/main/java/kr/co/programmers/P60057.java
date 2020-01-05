package kr.co.programmers;

import java.util.Arrays;

public class P60057 {
    public int solution(String s) {
        System.out.println("s = " + s + " (" + s.length() + ")");

        if (s.length() == 1) {
            return 1;
        }
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i <= s.length() / 2; i++) { // i글자씩 나눈다.
            System.out.println();
            // i글자씩 나눴을 때 배열 크기
            String[] w = new String[(s.length() / i) + (s.length() % i != 0 ? 1 : 0)];
            // i글자씩 나눈 후 배열에 넣는다.
            int pos = 0;
            for (int j = 0; j < s.length(); j += i) {
                int last = j + i;
                if (last > s.length()) {
                    last = s.length();
                }
                w[pos++] = s.substring(j, last);
            }

            System.out.println("w = " + Arrays.toString(w));

            StringBuilder r = new StringBuilder();
            int c = 1;
            for (int j = 1; j < w.length; j++) {
                if (w[j].equals(w[j - 1])) {
                    c++;
                } else {
                    if (c > 1) {
                        r.append(c);
                    }
                    r.append(w[j - 1]);
                    c = 1;
                }
            }
            // 배열을 전부 돈 후 남은 [카운트]와 [문자] 처리
            if (c > 1) {
                r.append(c);
            }
            r.append(w[w.length - 1]);

            System.out.println("r = " + r + " (" + r.length() + ")");

            // 계산해야 할 것은 자리수이다.
            if (r.length() < answer) { // 최소 자리수 치환
                answer = r.length();
            }
        }

        return answer;
    }
}
