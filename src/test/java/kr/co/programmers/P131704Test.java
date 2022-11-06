package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P131704Test {
    private final P131704 sut = new P131704();

    @Test
    void example01() {
        assertThat(sut.solution(new int[]{4, 3, 1, 2, 5}), is(2));
    }

    @Test
    void example02() {
        assertThat(sut.solution(new int[]{5, 4, 3, 2, 1}), is(5));
    }

}
