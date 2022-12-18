package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P133502Test {
    private final P133502 sut = new P133502();

    @Test
    void example01() {
        assertThat(sut.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}), is(2));
    }

    @Test
    void example02() {
        assertThat(sut.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}), is(0));
    }

}
