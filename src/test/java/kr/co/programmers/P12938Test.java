package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12938Test {
    private final P12938 sut = new P12938();

    @Test
    void example1() {
        assertThat(sut.solution(2, 9), is(new int[]{4, 5}));
    }

    @Test
    void example2() {
        assertThat(sut.solution(2, 1), is(new int[]{-1}));
    }

    @Test
    void example3() {
        assertThat(sut.solution(2, 8), is(new int[]{4, 4}));
    }

    @Test
    void example4() {
        assertThat(sut.solution(3, 9), is(new int[]{3, 3, 3}));
    }

    @Test
    void example5() {
        assertThat(sut.solution(3, 10), is(new int[]{3, 3, 4}));
    }

    @Test
    void example6() {
        assertThat(sut.solution(3, 11), is(new int[]{3, 4, 4}));
    }

}
