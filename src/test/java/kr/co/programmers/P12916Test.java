package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 */
public class P12916Test {
    private P12916 p = new P12916();

    @Test
    public void 입출력예1() {
        assertEquals(true, p.solution("pPoooyY"));
    }

    @Test
    public void 입출력예2() {
        assertEquals(false, p.solution("Pyy"));
    }
}