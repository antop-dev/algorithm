package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 */
public class P12954Test {
    private P12954 p = new P12954();

    @Test
    public void example01() {
        assertArrayEquals(new long[]{2, 4, 6, 8, 10}, p.solution(2, 5));
    }

    @Test
    public void example02() {
        assertArrayEquals(new long[]{4, 8, 12}, p.solution(4, 3));
    }

    @Test
    public void example03() {
        assertArrayEquals(new long[]{-4, -8}, p.solution(-4, 2));
    }

}
