package kr.co.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P92342Test {
    private final P92342 sut = new P92342();

    @DisplayName("example 01")
    @Test
    void example01() {
        assertThat(sut.solution(5, new int[]{2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}), is(new int[]{0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0}));
    }

    @DisplayName("example 02")
    @Test
    void example02() {
        assertThat(sut.solution(1, new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), is(new int[]{-1}));
    }

    @DisplayName("example 03")
    @Test
    void example03() {
        assertThat(sut.solution(9, new int[]{0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1}), is(new int[]{1, 1, 2, 0, 1, 2, 2, 0, 0, 0, 0}));
    }

    @DisplayName("example 04")
    @Test
    void example04() {
        assertThat(sut.solution(10, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 3}), is(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2}));
    }

}
