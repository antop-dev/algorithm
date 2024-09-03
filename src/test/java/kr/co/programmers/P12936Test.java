package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12936Test {
    private final P12936 sut = new P12936();

    @Test
    void example1() {
        assertThat(sut.solution(3, 5), is(new int[]{3, 1, 2}));
    }

}
