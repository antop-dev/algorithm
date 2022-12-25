package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P131701Test {
    private final P131701 sut = new P131701();

    @Test
    void example01() {
        assertThat(sut.solution(new int[]{7, 9, 1, 1, 4}), is(18));
    }
}
