package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 */
public class P12940Test {
    private P12940 p = new P12940();

    @Test
    public void example01() {
        assertArrayEquals(new int[]{3, 12}, p.solution(3, 12));
    }

    @Test
    public void example02() {
        assertArrayEquals(new int[]{1, 10}, p.solution(2, 5));
    }

}
