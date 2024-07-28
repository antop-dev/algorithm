package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12913Test {
    private final P12913 sut = new P12913();

    @Test
    void example1() {
        var land = new int[][]{
                {1, 2, 3, 5},
                {5, 6, 7, 8},
                {4, 3, 2, 1}
        };
        assertThat(sut.solution(land), is(16));
    }
}
