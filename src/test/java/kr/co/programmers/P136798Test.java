package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P136798Test {
    private final P136798 sut = new P136798();

    @Test
    void example01() {
        assertThat(sut.solution(5, 3, 2), is(10));
    }

    @Test
    void example02() {
        assertThat(sut.solution(10, 3, 2), is(21));
    }

}
