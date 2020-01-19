package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 */
public class P12899Test {
    private P12899 p = new P12899();

    @Test
    public void 입출력예1() {
        assertEquals("1", p.solution(1));
    }

    @Test
    public void 입출력예2() {
        assertEquals("2", p.solution(2));
    }

    @Test
    public void 입출력예3() {
        assertEquals("4", p.solution(3));
    }

    @Test
    public void 입출력예4() {
        assertEquals("11", p.solution(4));
    }

}