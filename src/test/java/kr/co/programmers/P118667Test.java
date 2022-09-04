package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P118667Test {
    private final P118667 sut = new P118667();

    @Test
    void example01() {
        assertThat(sut.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1}), is(2));
    }

    @Test
    void example02() {
        assertThat(sut.solution(new int[]{1, 2, 1, 2,}, new int[]{1, 10, 1, 2}), is(7));
    }

    @Test
    void example03() {
        assertThat(sut.solution(new int[]{1, 1}, new int[]{1, 5}), is(-1));
    }

}
