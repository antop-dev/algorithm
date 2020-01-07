package kr.co.programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 */
public class P12901Test {
    private P12901 p;

    @Before
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