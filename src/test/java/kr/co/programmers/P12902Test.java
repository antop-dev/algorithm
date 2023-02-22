package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12902Test {
    private final P12902 sut = new P12902();

    @Test
    void example1() {
        assertThat(sut.solution(4), is(11));
    }

    @Test
    void example2() {
        assertThat(sut.solution(6), is(41));
    }

    @Test
    void example3() {
        assertThat(sut.solution(6), is(41));
    }

    @Test
    void example4() {
        assertThat(sut.solution(8), is(153));
    }

    @Test
    void example6() {
        assertThat(sut.solution(12), is(2131));
    }

    @Test
    void example7() {
        assertThat(sut.solution(14), is(7953));
    }

    @Test
    void example8() {
        assertThat(sut.solution(5000), is(658712818));
    }

}
