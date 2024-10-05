package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12909Test {
    private final P12909 sut = new P12909();

    @Test
    void example1() {
        assertThat(sut.solution("()()"), is(true));
    }

    @Test
    void example2() {
        assertThat(sut.solution("(())()"), is(true));
    }

    @Test
    void example3() {
        assertThat(sut.solution(")()("), is(false));
    }

    @Test
    void example4() {
        assertThat(sut.solution("(()("), is(false));
    }
}
