package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 */
public class P12928Test {
    private P12928 p = new P12928();

    @Test
    public void 입출력예1() {
        assertEquals(28, p.solution(12));
    }

    @Test
    public void 입출력예2() {
        assertEquals(6, p.solution(5));
    }

}