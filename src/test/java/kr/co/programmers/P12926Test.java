package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */
public class P12926Test {
    private P12926 p = new P12926();

    @Test
    public void 입출력예1() {
        assertEquals("BC", p.solution("AB", 1));
    }

    @Test
    public void 입출력예2() {
        assertEquals("a", p.solution("z", 1));
    }

    @Test
    public void 입출력예3() {
        assertEquals("e F d", p.solution("a B z", 4));
    }

}