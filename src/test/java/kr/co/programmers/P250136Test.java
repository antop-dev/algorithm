package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P250136Test {
    private final P250136 sut = new P250136();

    @Test
    void example1() {
        var land = new int[][]{
                {0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 1, 1},
        };
        assertThat(sut.solution(land), is(9));
    }

    @Test
    void example2() {
        var land = new int[][]{
                {1, 0, 1, 0, 1, 1},
                {1, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1},
        };
        assertThat(sut.solution(land), is(16));
    }

    @Test
    void example3() {
        var land = new int[][]{{1}};
        assertThat(sut.solution(land), is(1));
    }

    @Test
    void example4() {
        var land = new int[][]{{0}};
        assertThat(sut.solution(land), is(0));
    }

    @Test
    void example5() {
        var land = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
        };
        assertThat(sut.solution(land), is(7));
    }

    @Test
    void example6() {
        var land = new int[][]{
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
        };
        assertThat(sut.solution(land), is(30));
    }
}
