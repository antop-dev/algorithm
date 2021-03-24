package kr.co.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P219Test {
    private final P219 p = new P219();

    @DisplayName("example 01")
    @Test
    void example01() {
        assertThat(p.solution(new int[]{3, 1, 2, 3}), is(2));
    }

    @DisplayName("example 02")
    @Test
    void example02() {
        assertThat(p.solution(new int[]{3, 3, 3, 2, 2, 4}), is(3));
    }

    @DisplayName("example 03")
    @Test
    void example03() {
        assertThat(p.solution(new int[]{3, 3, 3, 2, 2, 2}), is(2));
    }

}
