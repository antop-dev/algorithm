package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12971Test {
    private final P12971 sut = new P12971();

    @Test
    void example1() {
        assertThat(sut.solution(new int[]{14, 6, 5, 11, 3, 9, 2, 10}), is(36));
    }

    @Test
    void example2() {
        assertThat(sut.solution(new int[]{1, 3, 2, 5, 4}), is(8));
    }

    @Test
    void example3() {
        assertThat(sut.solution(new int[]{1}), is(1));
    }

    @Test
    void example4() {
        assertThat(sut.solution(new int[]{1, 2}), is(2));
    }

    @Test
    void example5() {
        assertThat(sut.solution(new int[]{2, 1}), is(2));
    }

    @Test
    void example6() {
        assertThat(sut.solution(new int[]{4, 3, 2, 9, 4}), is(13));
    }

    @Test
    void example7() {
        assertThat(sut.solution(new int[]{10, 1, 1, 10, 1}), is(20));
    }

    @Test
    void example8() {
        assertThat(sut.solution(new int[]{5, 1, 16, 17, 16}), is(32));
    }

}
