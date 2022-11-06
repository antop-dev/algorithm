package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P131128Test {
    private final P131128 sut = new P131128();

    @Test
    void example01() {
        assertThat(sut.solution("100", "2345"), is("-1"));
    }

    @Test
    void example02() {
        assertThat(sut.solution("100", "203045"), is("0"));
    }

    @Test
    void example03() {
        assertThat(sut.solution("100", "123450"), is("10"));
    }

    @Test
    void example04() {
        assertThat(sut.solution("12321", "42531"), is("321"));
    }

    @Test
    void example05() {
        assertThat(sut.solution("5525", "1255"), is("552"));
    }

}
