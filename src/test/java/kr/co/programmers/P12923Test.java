package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12923Test {
    private final P12923 sut = new P12923();

    @Test
    void example1() {
        assertThat(sut.solution(1, 10), is(new int[]{0, 1, 1, 2, 1, 3, 1, 4, 3, 5}));
    }

    @Test
    void example2() {
        assertThat(sut.solution(1, 1), is(new int[]{0}));
    }

    @Test
    void example3() {
        assertThat(sut.solution(47, 62), is(new int[]{1, 24, 7, 25, 17, 26, 1, 27, 11, 28, 19, 29, 1, 30, 1, 31}));
    }

    @Test
    void example4() {
        // 오답 : [1, 1, 6250001]
        assertThat(sut.solution(100000014, 100000016), is(new int[]{6, 5, 6250001}));
    }

    @Test
    void example5() {
        assertThat(sut.solution(477559014, 477559014), is(new int[]{6}));
    }
}
