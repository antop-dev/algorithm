package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class P12922Test {
    private P12922 p = new P12922();

    @Test
    public void example01() {
        assertEquals("수박수", p.solution(3));
    }

    @Test
    public void example02() {
        assertEquals("수박수박", p.solution(4));
    }

}
