package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12904
 */
public class P12904Test {
    private final P12904 p = new P12904();

    @Test
    public void 예1() {
        assertEquals(7, p.solution("abcdcba"));
    }

    @Test
    public void 예2() {
        assertEquals(3, p.solution("abacde"));
    }

    @Test
    public void 예3() {
        assertEquals(1, p.solution("abcde"));
    }

    @Test
    public void 예4() {
        assertEquals(1, p.solution("abcd"));
    }

    @Test
    public void 예5() {
        assertEquals(4, p.solution("abba"));
    }

    @Test
    public void 예6() {
        assertEquals(1, p.solution("a"));
    }

    @Test
    public void 예7() {
        assertEquals(1, p.solution("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void 예8() {
        assertEquals(3, p.solution("aba"));
    }

    @Test
    public void 예9() {
        assertEquals(3, p.solution("aaa"));
    }

    @Test
    public void 예10() {
        assertEquals(2, p.solution("aab"));
    }

    @Test
    public void 예11() {
        assertEquals(2, p.solution("baa"));
    }

    @Test
    public void 예12() {
        assertEquals(9, p.solution("abaabaaba"));
    }

}
