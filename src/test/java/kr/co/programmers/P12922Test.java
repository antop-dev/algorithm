package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class P12922Test {
    private P12922 p = new P12922();

    @Test
    public void 입출력예1() {
        assertEquals("수박수", p.solution(3));
    }

    @Test
    public void 입출력예2() {
        assertEquals("수박수박", p.solution(4));
    }

}