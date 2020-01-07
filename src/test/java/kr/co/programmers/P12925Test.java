package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 */
public class P12925Test {
    private P12925 p = new P12925();

    @Test
    public void 입출력예1() {
        assertEquals(1234, p.solution("1234"));
    }

    @Test
    public void 입출력예2() {
        assertEquals(-1234, p.solution("-1234"));
    }

}