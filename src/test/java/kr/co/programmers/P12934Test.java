package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12934
 */
public class P12934Test {
    private P12934 p = new P12934();

    @Test
    public void 입출력예1() {
        assertEquals(144, p.solution(121));
    }

    @Test
    public void 입출력예2() {
        assertEquals(-1, p.solution(3));
    }

    @Test
    public void 입출력예3() {
        assertEquals(4, p.solution(1));
    }

    @Test
    public void 입출력예4() {
        assertEquals(-1, p.solution(50_000_000_000_000L));
    }

}
