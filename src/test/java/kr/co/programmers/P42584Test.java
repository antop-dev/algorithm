package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P42584Test {
    private final P42584 p = new P42584();

    @Test
    void example01() {
        assertThat(p.solution(new int[]{1, 2, 3, 2, 3}), is(new int[]{4, 3, 1, 1, 0}));
    }
}
