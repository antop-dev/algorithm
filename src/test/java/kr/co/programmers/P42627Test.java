package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42627
 */
public class P42627Test {
    private final P42627 p = new P42627();

    @Test
    public void 예1() {
        assertEquals(9, p.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
    }

    @Test
    public void 예2() {
        assertEquals(74, p.solution(new int[][]{
                {24, 10}, {18, 39}, {34, 20}, {37, 5}, {47, 22},
                {20, 47}, {15, 2}, {15, 34}, {35, 43}, {26, 1}})
        );
    }

    @Test
    public void 예3() {
        assertEquals(6, p.solution(new int[][]{{0, 3}, {1, 9}, {500, 6}}));
    }

    @Test
    public void 예4() {
        assertEquals(6, p.solution(new int[][]{{0, 5}, {1, 2}, {5, 5}}));
    }

    @Test
    public void 예5() {
        assertEquals(13, p.solution(new int[][]{{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}}));
    }

    @Test
    public void 예6() {
        assertEquals(13, p.solution(new int[][]{{1, 9}, {1, 4}, {1, 5}, {1, 7}, {1, 3}}));
    }

    @Test
    public void 예7() {
        assertEquals(9, p.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}, {4, 3}}));
        // [0, 3], [2, 6], [4, 3], [1, 9]
    }

    @Test
    public void 예8() {
        assertEquals(0, p.solution(new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}}));
    }

    @Test
    public void 예9() {
        assertEquals(14, p.solution(new int[][]{{0, 10}, {0, 5}, {2, 3}, {2, 7}, {8, 10}, {8, 1}}));
    }

}