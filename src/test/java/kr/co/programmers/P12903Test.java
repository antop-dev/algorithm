package kr.co.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */
public class P12903Test {
    private P12903 p;

    @BeforeEach
    public void setUp() {
        p = new P12903();
    }

    @Test
    public void example01() {
        assertEquals("c", p.solution("abcde"));
    }

    @Test
    public void example02() {
        assertEquals("we", p.solution("qwer"));
    }
}
