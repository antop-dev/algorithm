package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 */
public class P12944Test {
    private P12944 p = new P12944();

    @Test
    public void example01() {
        assertEquals(2.5, p.solution(new int[]{1, 2, 3, 4}), 0.01);
    }

    @Test
    public void example02() {
        assertEquals(5, p.solution(new int[]{5, 5}), 0.01);
    }

}
