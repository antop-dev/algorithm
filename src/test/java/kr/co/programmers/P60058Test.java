package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P60058Test {
    private final P60058 sut = new P60058();

    @Test
    void example01() {
        assertThat(sut.solution("(()())()"), is("(()())()"));
    }

    @Test
    void example02() {
        assertThat(sut.solution(")("), is("()"));
    }

    @Test
    void example03() {
        assertThat(sut.solution("()))((()"), is("()(())()"));
    }

}
