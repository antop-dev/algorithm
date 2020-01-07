package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 */
public class P42889Test {
    private P42889 p = new P42889();

    @Test
    public void 입출력예1() {
        assertArrayEquals(new int[]{3, 4, 2, 1, 5}, p.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(new int[]{4, 1, 2, 3}, p.solution(4, new int[]{4, 4, 4, 4, 4}));
    }
}