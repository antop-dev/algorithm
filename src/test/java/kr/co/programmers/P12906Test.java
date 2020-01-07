package kr.co.programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class P12906Test {
    private P12906 p;

    @Before
    public void setUp() {
        p = new P12906();
    }

    @Test
    public void 입출력예1() {
        assertArrayEquals(new int[]{1, 3, 0, 1}, p.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(new int[]{4, 3}, p.solution(new int[]{4, 4, 4, 3, 3}));
    }
}