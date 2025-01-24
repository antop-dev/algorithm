package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12907Test {
    private final P12907 sut = new P12907();

    @Test
    void example1() {
        assertThat(sut.solution(5, new int[]{1, 2, 5}), is(4));
    }
}
