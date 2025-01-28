package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12987Test {
    private final P12987 sut = new P12987();

    @Test
    void example1() {
        assertThat(
                sut.solution(new int[]{5, 1, 3, 7}, new int[]{2, 2, 6, 8}),
                is(3)
        );
    }

    @Test
    void example2() {
        assertThat(
                sut.solution(new int[]{2, 2, 2, 2}, new int[]{1, 1, 1, 1}),
                is(0)
        );
    }
}
