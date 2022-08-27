package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P87390Test {
    private final P87390 sut = new P87390();

    @Test
    void example01() {
        assertThat(sut.solution(3, 2, 5), is(new int[]{3, 2, 2, 3}));
    }

    @Test
    void example02() {
        assertThat(sut.solution(4, 7, 14), is(new int[]{4, 3, 3, 3, 4, 4, 4, 4}));
    }

}
