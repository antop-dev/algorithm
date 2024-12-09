package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12979Test {
    private final P12979 sut = new P12979();

    @Test
    void example1() {
        assertThat(sut.solution(11, new int[]{4, 11}, 1), is(3));
    }

    @Test
    void example2() {
        assertThat(sut.solution(16, new int[]{9}, 2), is(3));
    }

    @Test
    void example3() {
        assertThat(sut.solution(5, new int[]{1, 5}, 1), is(1));
    }

    @Test
    void example4() {
        assertThat(sut.solution(5, new int[]{5}, 3), is(1));
    }

    @Test
    void example5() {
        assertThat(sut.solution(6, new int[]{}, 1), is(2));
    }
}
