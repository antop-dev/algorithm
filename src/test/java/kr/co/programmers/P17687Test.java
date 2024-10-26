package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P17687Test {
    private final P17687 sut = new P17687();

    @Test
    void example1() {
        assertThat(
                sut.solution(2, 4, 2, 1),
                is("0111")
        );
    }

    @Test
    void example2() {
        assertThat(
                sut.solution(16, 16, 2, 1),
                is("02468ACE11111111")
        );
    }

    @Test
    void example3() {
        assertThat(
                sut.solution(16, 16, 2, 2),
                is("13579BDF01234567")
        );
    }
}
