package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P138476Test {
    private final P138476 sut = new P138476();

    @Test
    void example01() {
        assertThat(sut.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}), is(3));
    }

    @Test
    void example02() {
        assertThat(sut.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}), is(2));
    }

    @Test
    void example03() {
        assertThat(sut.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}), is(1));
    }

}
