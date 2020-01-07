package kr.co.programmers;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 */
public class P12915 {
    public String[] solution(String[] strings, final int n) {
        Arrays.sort(strings, Comparator.comparingInt((String x) -> x.charAt(n)).thenComparing(x -> x));
        return strings;
    }
}
