package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P42884Test {
    private final P42884 p = new P42884();

    @Test
    void example01() {
        assertThat(p.solution(new int[][]{{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}}), is(2));
    }

    @Test
    void example02() {
        assertThat(p.solution(new int[][]{{-2, -1}, {1, 2}, {-3, 0}}), is(2));
    }

    @Test
    void example03() {
        assertThat(p.solution(new int[][]{{0, 0}}), is(1));
    }

    @Test
    void example04() {
        assertThat(p.solution(new int[][]{{0, 1}, {2, 3}, {4, 5}, {6, 7}}), is(4));
    }

    @Test
    void example05() {
        assertThat(p.solution(new int[][]{{-20, 15}, {-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}}), is(2));
    }


}
