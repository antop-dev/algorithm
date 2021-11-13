package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 */
public class P12933Test {
    private P12933 p = new P12933();

    @Test
    public void example01() {
        assertEquals(873211, p.solution(118372));
    }

    @Test
    public void example02() {
        assertEquals(873211, p.solution(873211));
    }

    @Test
    public void example03() {
        assertEquals(1, p.solution(1));
    }

    @Test
    public void example04() {
        assertEquals(8_000_000_000L, p.solution(8_000_000_000L));
    }

}
