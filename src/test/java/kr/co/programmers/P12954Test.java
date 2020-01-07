package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 */
public class P12954Test {
    private P12954 p = new P12954();

    @Test
    public void 입출력예1() {
        assertArrayEquals(new long[]{2, 4, 6, 8, 10}, p.solution(2, 5));
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(new long[]{4, 8, 12}, p.solution(4, 3));
    }

    @Test
    public void 입출력예3() {
        assertArrayEquals(new long[]{-4, -8}, p.solution(-4, 2));
    }

}