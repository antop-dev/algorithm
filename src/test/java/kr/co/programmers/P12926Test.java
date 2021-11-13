package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */
public class P12926Test {
    private P12926 p = new P12926();

    @Test
    public void example01() {
        assertEquals("BC", p.solution("AB", 1));
    }

    @Test
    public void example02() {
        assertEquals("a", p.solution("z", 1));
    }

    @Test
    public void example03() {
        assertEquals("e F d", p.solution("a B z", 4));
    }

}
