package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12937
 */
public class P12937Test {
    private P12937 p = new P12937();

    @Test
    public void example01() {
        assertEquals("Odd", p.solution(3));
    }

    @Test
    public void example02() {
        assertEquals("Even", p.solution(4));
    }

}
