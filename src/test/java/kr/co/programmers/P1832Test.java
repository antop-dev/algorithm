package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P1832Test {
    private final P1832 sut = new P1832();

    @Test
    void example1() {
        int[][] cityMap = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
        var m = cityMap.length;
        var n = cityMap[m - 1].length;
        assertThat(sut.solution(m, n, cityMap), is(6));
    }

    @Test
    void example2() {
        int[][] cityMap = {
                {0, 2, 0, 0, 0, 2},
                {0, 0, 2, 0, 1, 0},
                {1, 0, 0, 2, 2, 0},
        };
        var m = cityMap.length;
        var n = cityMap[m - 1].length;
        assertThat(sut.solution(m, n, cityMap), is(2));
    }

    @Test
    void example3() {
        var cityMap = new int[][]{
                {0, 0, 0, 2, 2},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        var m = cityMap.length;
        var n = cityMap[m - 1].length;
        assertThat(sut.solution(m, n, cityMap), is(12));
    }

    @Test
    void example4() {
        var cityMap = new int[][]{
                {0, 0},
                {2, 0},
                {2, 0},
                {0, 0},
        };
        var m = cityMap.length;
        var n = cityMap[m - 1].length;
        assertThat(sut.solution(m, n, cityMap), is(2));
    }

    @Test
    void example5() {
        var cityMap = new int[][]{
                {0, 0, 0, 0, 0},
                {2, 0, 0, 2, 1},
                {2, 0, 0, 1, 0},
                {0, 1, 0, 0, 0},
        };
        var m = cityMap.length;
        var n = cityMap[m - 1].length;
        assertThat(sut.solution(m, n, cityMap), is(3));
    }
}