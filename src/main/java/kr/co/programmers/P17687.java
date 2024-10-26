package kr.co.programmers;

import java.util.ArrayDeque;

// https://github.com/antop-dev/algorithm/issues/598
public class P17687 {
    public String solution(int n, int t, int m, int p) {
        int v = 0;
        var output = new StringBuilder();
        var limit = ((t - 1) * m) + p;
        while (output.length() < limit) {
            var s = convert(v, n);
            output.append(s);
            v++;
        }

        var ans = new StringBuilder();
        for (var i = p - 1; i < (m * t); i += m) {
            ans.append(output.charAt(i));
        }
        return ans.toString();
    }

    /**
     * 10진수를 n진수로 변환
     *
     * @param v 10진수
     * @param n 변환할 n진수
     * @return 변환된 n진수 값
     */
    private String convert(int v, int n) {
        if (v == 0) {
            return "0";
        }
        var stack = new ArrayDeque<Character>();
        while (v > 0) {
            var x = v % n;
            int ch = switch (x) {
                case 10 -> 'A';
                case 11 -> 'B';
                case 12 -> 'C';
                case 13 -> 'D';
                case 14 -> 'E';
                case 15 -> 'F';
                default -> x + '0';
            };
            stack.push((char) ch);
            v /= n;
        }
        var sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
