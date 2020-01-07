package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 */
public class P12932Test {
    private P12932 p = new P12932();

    @Test
    public void 입출력예() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, p.solution(12345));
    }

}