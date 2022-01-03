package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P70130Test {
    private final P70130 p = new P70130();

    @Test
    void example01() {
        assertThat(p.solution(new int[]{0}), is(0));
    }

    @Test
    void example02() {
        assertThat(p.solution(new int[]{5, 2, 3, 3, 5, 3}), is(4));
    }

    @Test
    void example03() {
        assertThat(p.solution(new int[]{0, 3, 3, 0, 7, 2, 0, 2, 2, 0}), is(8));
    }

    @Test
    void example04() {
        assertThat(p.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 5, 1}), is(8));
    }

    @Test
    void example05() {
        assertThat(p.solution(new int[]{1, 2, 1, 3, 1, 1, 4, 1, 5, 1}), is(8));
    }

    @Test
    void example06() {
        assertThat(p.solution(new int[]{2, 3, 4, 1, 1, 1, 1, 5, 6, 7}), is(4));
    }

    @Test
    void example07() {
        assertThat(p.solution(new int[]{3, 3, 3, 3, 3, 3, 3}), is(0));
    }

    @Test
    void example08() {
        assertThat(p.solution(new int[]{1, 2, 1}), is(2));
    }


}
