package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 */
public class P12921Test {
    private P12921 p = new P12921();

    @Test
    public void 입출력예1() {
        assertEquals(4, p.solution(10));
    }

    @Test
    public void 입출력예2() {
        assertEquals(3, p.solution(5));
    }

    @Test
    public void 입출력예3() {
        assertEquals(25, p.solution(100));
    }

    @Test
    public void 입출력예4() {
        assertEquals(46, p.solution(200));
    }

    @Test
    public void 입출력예5() {
        assertEquals(168, p.solution(1000));
    }

}
