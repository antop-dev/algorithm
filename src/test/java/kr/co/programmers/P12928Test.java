package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 */
public class P12928Test {
    private P12928 p = new P12928();

    @Test
    public void example01() {
        assertEquals(28, p.solution(12));
    }

    @Test
    public void example02() {
        assertEquals(6, p.solution(5));
    }

}
