package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 */
public class P12899Test {
    private P12899 p = new P12899();

    @Test
    public void example01() {
        assertEquals("1", p.solution(1));
    }

    @Test
    public void example02() {
        assertEquals("2", p.solution(2));
    }

    @Test
    public void example03() {
        assertEquals("4", p.solution(3));
    }

    @Test
    public void example04() {
        assertEquals("11", p.solution(4));
    }

}
