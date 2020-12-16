package kr.co.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P60057Test {
    private P60057 solution;

    @BeforeEach
    public void setUp() {
        solution = new P60057();
    }

    @Test
    public void solution1() {
        assertEquals(solution.solution("aabbaccc"), 7);
    }

    @Test
    public void solution2() {
        assertEquals(solution.solution("ababcdcdababcdcd"), 9);
    }

    @Test
    public void solution3() {
        assertEquals(solution.solution("abcabcdede"), 8);
    }

    @Test
    public void solution4() {
        assertEquals(solution.solution("abcabcabcabcdededededede"), 14);
    }

    @Test
    public void solution5() {
        assertEquals(solution.solution("xababcdcdababcdcd"), 17);
    }
}
