package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 */
public class P12916 {
    public boolean solution(String s) {
        int p = 0;
        int y = 0;
        for (char c : s.toUpperCase().toCharArray()) {
            if (c == 'P') {
                p++;
            } else if (c == 'Y') {
                y++;
            }
        }

        System.out.println("p = " + p);
        System.out.println("y = " + y);

        return p == y;
    }
}
