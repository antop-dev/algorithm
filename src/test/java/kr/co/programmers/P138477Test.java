package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P138477Test {
    private final P138477 sut = new P138477();

    @Test
    void example01() {
        assertThat(
                sut.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}),
                is(new int[]{10, 10, 10, 20, 20, 100, 100})
        );
    }

    @Test
    void example02() {
        assertThat(
                sut.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}),
                is(new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300})
        );
    }

}
