package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12911Test {
    private final P12911 sut = new P12911();

    @Test
    void example1() {
        assertThat(sut.solution(78), is(83));
    }

    @Test
    void example2() {
        assertThat(sut.solution(15), is(23));
    }

    @Test
    void example3() {
        assertThat(sut.solution(1_000_000), is(1_000_064));
    }
}
