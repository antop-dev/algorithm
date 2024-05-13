package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12924Test {
    private final P12924 sut = new P12924();

    @Test
    void example1() {
        assertThat(sut.solution(15), is(4));
    }

}
