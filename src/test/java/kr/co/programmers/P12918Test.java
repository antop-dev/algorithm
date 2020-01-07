package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 */
public class P12918Test {
    private P12918 p = new P12918();

    @Test
    public void 입출력예1() {
        assertEquals(false, p.solution("a234"));
    }

    @Test
    public void 입출력예2() {
        assertEquals(true, p.solution("1234"));
    }
}