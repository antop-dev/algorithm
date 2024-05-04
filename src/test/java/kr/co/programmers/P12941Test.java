package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12941Test {
    private final P12941 sut = new P12941();

    @Test
    void example1() {
        int[] a = new int[]{1, 4, 2};
        int[] b = new int[]{5, 4, 4};
        assertThat(sut.solution(a, b), is(29));
    }

    @Test
    void example2() {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};
        assertThat(sut.solution(a, b), is(10));
    }

}
