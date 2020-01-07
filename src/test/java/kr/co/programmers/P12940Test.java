package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 */
public class P12940Test {
    private P12940 p = new P12940();

    @Test
    public void 입출력예1() {
        assertArrayEquals(new int[]{3, 12}, p.solution(3, 12));
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(new int[]{1, 10}, p.solution(2, 5));
    }

}