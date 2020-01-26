package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 */
public class P12944Test {
    private P12944 p = new P12944();

    @Test
    public void 입출력예1() {
        assertEquals(2.5, p.solution(new int[]{1, 2, 3, 4}), 0.01);
    }

    @Test
    public void 입출력예2() {
        assertEquals(5, p.solution(new int[]{5, 5}), 0.01);
    }

}