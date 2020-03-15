package kr.co.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12905
 */
class P12905Test {
    private final P12905 p = new P12905();

    @Test
    @DisplayName("예제 1")
    void test01() {
        assertEquals(9, p.solution(new int[][]{
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 0}
        }));
    }

    @Test
    @DisplayName("예제 2")
    void test02() {
        assertEquals(4, p.solution(new int[][]{
                {0, 0, 1, 1},
                {1, 1, 1, 1}
        }));
    }

    @Test
    @DisplayName("예제 3")
    void test03() {
        assertEquals(1, p.solution(new int[][]{
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        }));
    }

    @Test
    @DisplayName("예제 4")
    void test04() {
        assertEquals(1, p.solution(new int[][]{
                {0, 0, 0, 0},
                {1, 0, 0, 0}
        }));
    }

    @Test
    @DisplayName("예제 5")
    void test05() {
        assertEquals(0, p.solution(new int[][]{{}}));
    }

    @Test
    @DisplayName("예제 6")
    void test06() {
        assertEquals(0, p.solution(new int[][]{{0, 0, 0, 0, 0}}));
        assertEquals(0, p.solution(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }));
    }
}