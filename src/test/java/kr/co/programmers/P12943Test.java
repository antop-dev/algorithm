package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */
public class P12943Test {
    private P12943 p = new P12943();

    @Test
    public void example01() {
        assertEquals(8, p.solution(6));
    }

    @Test
    public void example02() {
        assertEquals(4, p.solution(16));
    }

    @Test
    public void example03() {
        assertEquals(-1, p.solution(626331));
    }

}
