package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 */
public class P12918Test {
    private P12918 p = new P12918();

    @Test
    public void example01() {
        assertEquals(false, p.solution("a234"));
    }

    @Test
    public void example02() {
        assertEquals(true, p.solution("1234"));
    }
}
