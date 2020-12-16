package kr.co.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 */
public class P12901Test {
    private P12901 p;

    @BeforeEach
    public void setUp() {
        p = new P12901();
    }

    @Test
    public void 입출력예1() {
        assertEquals("TUE", p.solution(5, 24));
    }

    @Test
    public void 입출력예2() {
        assertEquals("SUN", p.solution(2, 28));
    }

    @Test
    public void 입출력예3() {
        assertEquals("MON", p.solution(2, 29));
    }
}
