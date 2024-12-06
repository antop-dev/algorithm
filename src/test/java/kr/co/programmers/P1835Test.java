package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P1835Test {
    private final P1835 sut = new P1835();

    @Test
    void example1() {
        assertThat(sut.solution(2, new String[]{"N~F=0", "R~T>2"}), is(3648));
    }

    @Test
    void example2() {
        assertThat(sut.solution(2, new String[]{"M~C<2", "C~M>1"}), is(0));
    }
}
