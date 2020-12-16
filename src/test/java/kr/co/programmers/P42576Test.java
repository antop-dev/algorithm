package kr.co.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class P42576Test {
    private P42576 solution;

    @BeforeEach
    public void setUp() {
        solution = new P42576();
    }

    @Test
    public void 예제1() {
        assertEquals("leo", solution.solution(
                new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"})
        );
    }

    @Test
    public void 예제2() {
        assertEquals("vinko", solution.solution(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"})
        );
    }

    @Test
    public void 예제3() {
        assertEquals("mislav", solution.solution(
                new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"})
        );
    }
}
