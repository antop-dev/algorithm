package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P135807Test {
    private final P135807 sut = new P135807();

    @Test
    void example01() {
        assertThat(sut.solution(new int[]{10, 17}, new int[]{5, 20}), is(0));
    }

    @Test
    void example02() {
        assertThat(sut.solution(new int[]{10, 20}, new int[]{5, 17}), is(10));
    }

    @Test
    void example03() {
        assertThat(sut.solution(new int[]{14, 35, 119}, new int[]{18, 30, 102}), is(7));
    }

}
