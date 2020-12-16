package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 */
public class P12919Test {
    private P12919 p = new P12919();

    @Test
    public void 입출력예() {
        assertEquals("김서방은 1에 있다", p.solution(new String[]{"Jane", "Kim"}));
    }

}
