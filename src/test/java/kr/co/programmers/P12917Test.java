package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 */
public class P12917Test {
    private P12917 p = new P12917();

    @Test
    public void 입출력예() {
        assertEquals("gfedcbZ", p.solution("Zbcdefg"));
    }
}