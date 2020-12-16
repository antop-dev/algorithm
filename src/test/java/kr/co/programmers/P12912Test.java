package kr.co.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */
public class P12912Test {
    private P12912 p;

    @BeforeEach
    public void setUp() {
        p = new P12912();
    }

    @Test
    public void 입출력예1() {
        assertEquals(12, p.solution(3, 5));
    }

    @Test
    public void 입출력예2() {
        assertEquals(3, p.solution(3, 3));
    }

    @Test
    public void 입출력예3() {
        assertEquals(12, p.solution(5, 3));
    }
}
