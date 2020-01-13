package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42588
 */
public class P42588Test {
    private P42588 p = new P42588();

    @Test
    public void 입출력예1() {
        assertArrayEquals(new int[]{0, 0, 2, 2, 4}, p.solution(new int[]{6, 9, 5, 7, 4}));
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(new int[]{0, 0, 0, 3, 3, 3, 6}, p.solution(new int[]{3, 9, 9, 3, 5, 7, 2}));
    }

    @Test
    public void 입출력예3() {
        assertArrayEquals(new int[]{0, 0, 2, 0, 0, 5, 6}, p.solution(new int[]{1, 5, 3, 6, 7, 6, 5}));
    }
}