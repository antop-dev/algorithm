package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */
public class P12930Test {
    private P12930 p = new P12930();

    @Test
    public void 입출력예() {
        assertEquals("TrY HeLlO WoRlD", p.solution("try hello world"));
    }

}