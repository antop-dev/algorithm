package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 */
public class P12935Test {
    private P12935 p = new P12935();

    @Test
    public void 입출력예1() {
        assertArrayEquals(new int[]{4, 3, 2}, p.solution(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(new int[]{-1}, p.solution(new int[]{10}));
    }

}