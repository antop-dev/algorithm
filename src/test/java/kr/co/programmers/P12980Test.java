package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12980Test {
    private final P12980 sut = new P12980();

    @Test
    void example1() {
        assertThat(sut.solution(5), is(2));
    }

    @Test
    void example2() {
        assertThat(sut.solution(6), is(2));
    }

    @Test
    void example3() {
        assertThat(sut.solution(5000), is(5));
    }

}
