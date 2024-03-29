package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 */
public class P12915Test {
    private P12915 p = new P12915();

    @Test
    public void example01() {
        assertArrayEquals(new String[]{"car", "bed", "sun"}, p.solution(new String[]{"sun", "bed", "car"}, 1));
    }

    @Test
    public void example02() {
        assertArrayEquals(new String[]{"abcd", "abce", "cdx"}, p.solution(new String[]{"abce", "abcd", "cdx"}, 2));
    }
}
