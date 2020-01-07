package kr.co.programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class P42748Test {
    private P42748 p;

    @Before
    public void setUp() {
        p = new P42748();
    }

    @Test
    public void 입출력예() {
        assertArrayEquals(new int[]{5, 6, 3}, p.solution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{
                        {2, 5, 3},
                        {4, 4, 1},
                        {1, 7, 3}
                }
        ));
    }
}