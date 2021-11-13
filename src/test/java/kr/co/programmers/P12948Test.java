package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 */
public class P12948Test {
    private P12948 p = new P12948();

    @Test
    public void example01() {
        assertEquals("*******4444", p.solution("01033334444"));
    }

    @Test
    public void example02() {
        assertEquals("*****8888", p.solution("027778888"));
    }

}
