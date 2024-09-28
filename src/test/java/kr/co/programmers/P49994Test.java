package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P49994Test {
    private final P49994 sut = new P49994();

    @Test
    void example1() {
        assertThat(sut.solution("ULURRDLLU"), is(7));
    }

    @Test
    void example2() {
        assertThat(sut.solution("LULLLLLLU"), is(7));
    }

    @Test
    void example3() {
        assertThat(sut.solution("UUUUUUUUU"), is(5));
    }

    @Test
    void example4() {
        assertThat(sut.solution("RRRRRRRRR"), is(5));
    }

    @Test
    void example5() {
        assertThat(sut.solution("DDDDDDDDD"), is(5));
    }

    @Test
    void example6() {
        assertThat(sut.solution("LLLLLLLLL"), is(5));
    }

    @Test
    void example7() {
        assertThat(sut.solution("UDLRDURL"), is(4));
    }

    @Test
    void example8() {
        assertThat(sut.solution("RRRRRLLLLL"), is(5));
    }


}
