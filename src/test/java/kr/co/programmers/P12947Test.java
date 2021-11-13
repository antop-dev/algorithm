package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 */
public class P12947Test {
    private P12947 p = new P12947();

    @Test
    public void example01() {
        assertEquals(true, p.solution(10));
    }

    @Test
    public void example02() {
        assertEquals(true, p.solution(12));
    }

    @Test
    public void example03() {
        assertEquals(false, p.solution(11));
    }

    @Test
    public void example04() {
        assertEquals(false, p.solution(13));
    }

}
