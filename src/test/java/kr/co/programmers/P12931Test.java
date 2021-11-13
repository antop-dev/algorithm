package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 */
public class P12931Test {
    private P12931 p = new P12931();

    @Test
    public void example01() {
        assertEquals(6, p.solution(123));
    }

    @Test
    public void example02() {
        assertEquals(24, p.solution(987));
    }

}
