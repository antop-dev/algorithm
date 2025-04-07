package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P250137Test {
    private final P250137 sut = new P250137();

    @Test
    void example01() {
        assertThat(
                sut.solution(
                        new int[]{5, 1, 5},
                        30,
                        new int[][]{
                                {2, 10},
                                {9, 15},
                                {10, 5},
                                {11, 5},
                        }
                ),
                is(5)
        );
    }

    @Test
    void example02() {
        assertThat(
                sut.solution(
                        new int[]{3, 2, 7},
                        20,
                        new int[][]{
                                {1, 15},
                                {5, 16},
                                {8, 6},
                        }
                ),
                is(-1)
        );
    }

    @Test
    void example03() {
        assertThat(
                sut.solution(
                        new int[]{4, 2, 7},
                        20,
                        new int[][]{
                                {1, 15},
                                {5, 16},
                                {8, 6},
                        }
                ),
                is(-1)
        );
    }

    @Test
    void example04() {
        assertThat(
                sut.solution(
                        new int[]{1, 1, 1},
                        5,
                        new int[][]{
                                {1, 2},
                                {3, 2},
                        }
                ),
                is(3)
        );
    }

    @Test
    void example05() {
        assertThat(
                sut.solution(
                        new int[]{5, 1, 5},
                        100,
                        new int[][]{
                                {1, 90},
                                {20, 10},
                        }
                ),
                is(33)
        );
    }
}
