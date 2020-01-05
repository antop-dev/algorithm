package kr.co.programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P17680Test {

    private P17680 solution;

    @Before
    public void setUp() {
        solution = new P17680();
    }

    @Test
    public void solution1() {
        assertEquals(50, solution.solution(3,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }

    @Test
    public void solution2() {
        assertEquals(21, solution.solution(3,
                new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
    }

    @Test
    public void solution3() {
        assertEquals(60, solution.solution(2,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
    }

    @Test
    public void solution4() {
        assertEquals(52, solution.solution(5,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
    }

    @Test
    public void solution5() {
        assertEquals(16, solution.solution(2,
                new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
    }

    @Test
    public void solution6() {
        assertEquals(25, solution.solution(0,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }

    @Test
    public void solution7() {
        assertEquals(30, solution.solution(10,
                new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }

    @Test
    public void solution8() {
        assertEquals(6, solution.solution(1, new String[]{"Jeju", "Jeju"}));
    }

    @Test
    public void solution9() {
        assertEquals(0, solution.solution(3, new String[]{}));
    }
}