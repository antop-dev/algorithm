package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P42898Test {
    private final P42898 sut = new P42898();

    @Test
    void example1() {
        int[][] puddles = {{2, 2}};
        assertThat(sut.solution(4, 3, puddles), is(4));
    }

    @Test
    void example2() {
        int[][] puddles = {};
        assertThat(sut.solution(2, 2, puddles), is(2));
    }

    @Test
    void example3() {
        int[][] puddles = {};
        assertThat(sut.solution(3, 3, puddles), is(6));
    }

    @Test
    void example4() {
        int[][] puddles = {{1, 2}};
        assertThat(sut.solution(3, 3, puddles), is(3));
    }
}
