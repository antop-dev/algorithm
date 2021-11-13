package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 */
public class P12925Test {
    private P12925 p = new P12925();

    @Test
    public void example01() {
        assertEquals(1234, p.solution("1234"));
    }

    @Test
    public void example02() {
        assertEquals(-1234, p.solution("-1234"));
    }

}
