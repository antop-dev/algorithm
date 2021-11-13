package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 */
public class P12982Test {
    private P12982 p = new P12982();

    @Test
    public void example01() {
        assertEquals(3, p.solution(new int[]{1, 3, 2, 5, 4}, 9));
    }

    @Test
    public void example02() {
        assertEquals(4, p.solution(new int[]{2, 2, 3, 3}, 10));
    }
}
