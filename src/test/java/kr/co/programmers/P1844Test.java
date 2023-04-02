package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P1844Test {
    private final P1844 sut = new P1844();

    @Test
    void example01() {
        assertThat(
                sut.solution(
                        new int[][]{
                                {1, 0, 1, 1, 1},
                                {1, 0, 1, 0, 1},
                                {1, 0, 1, 1, 1},
                                {1, 1, 1, 0, 1},
                                {0, 0, 0, 0, 1}
                        }
                ),
                is(11)
        );
    }

    @Test
    void example02() {
        assertThat(
                sut.solution(
                        new int[][]{
                                {1, 0, 1, 1, 1},
                                {1, 0, 1, 0, 1},
                                {1, 0, 1, 1, 1},
                                {1, 1, 1, 0, 0},
                                {0, 0, 0, 0, 1}
                        }
                ),
                is(-1)
        );
    }
}
