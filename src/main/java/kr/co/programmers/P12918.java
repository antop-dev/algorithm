package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 */
public class P12918 {
    public boolean solution(String s) {
        char[] chars = s.toCharArray();
        if (chars.length != 4 && chars.length != 6) {
            return false;
        }
        for (char c : chars) {
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
