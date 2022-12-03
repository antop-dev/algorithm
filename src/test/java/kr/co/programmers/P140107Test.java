package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P140107Test {
    private final P140107 sut = new P140107();

    @Test
    void example01() {
        assertThat(sut.solution(2, 4), is(6L));
    }

    @Test
    void example02() {
        assertThat(sut.solution(1, 5), is(26L));
    }

}
