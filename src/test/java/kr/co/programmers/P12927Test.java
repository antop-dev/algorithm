package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12927Test {
    private final P12927 sut = new P12927();

    @Test
    void example1() {
        assertThat(sut.solution(4, new int[]{4, 3, 3}), is(12L));
    }

    @Test
    void example2() {
        assertThat(sut.solution(1, new int[]{2, 1, 2}), is(6L));
    }

    @Test
    void example3() {
        assertThat(sut.solution(3, new int[]{1, 1}), is(0L));
    }

}
