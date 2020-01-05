package kr.co.programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P60057Test {
    private P60057 solution;

    @Before
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