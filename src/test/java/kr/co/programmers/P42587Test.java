package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 */
public class P42587Test {
    private P42587 p = new P42587();

    @Test
    public void 예제1() {
        assertEquals(1, p.solution(new int[]{2, 1, 3, 2}, 2));
    }

    @Test
    public void 예제2() {
        assertEquals(5, p.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
