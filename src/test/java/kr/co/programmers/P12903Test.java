package kr.co.programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */
public class P12903Test {
    private P12903 p;

    @Before
    public void setUp() {
        p = new P12903();
    }

    @Test
    public void 입출력예1() {
        assertEquals("c", p.solution("abcde"));
    }

    @Test
    public void 입출력예2() {
        assertEquals("we", p.solution("qwer"));
    }
}