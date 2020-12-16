package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12950
 */
public class P12950Test {
    private P12950 p = new P12950();

    @Test
    public void 입출력예1() {
        assertArrayEquals(
                new int[][]{{4, 6}, {7, 9}},
                p.solution(
                        new int[][]{{1, 2}, {2, 3}},
                        new int[][]{{3, 4}, {5, 6}}
                )
        );
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(
                new int[][]{{4}, {6}},
                p.solution(
                        new int[][]{{1}, {2}},
                        new int[][]{{3}, {4}}
                )
        );
    }

}
