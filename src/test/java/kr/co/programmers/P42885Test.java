package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P42885Test {
    private final P42885 sut = new P42885();

    @Test
    void example1() {
        match(new int[]{70, 50, 80, 50}, 100, 3);
    }

    @Test
    void example2() {
        match(new int[]{70, 80, 50}, 100, 3);
    }

    @Test
    void example3() {
        match(new int[]{20, 30, 70, 80}, 100, 2);
    }

    @Test
    void example4() {
        match(new int[]{40, 20, 20, 40, 40}, 160, 3);
    }

    @Test
    void example5() {
        match(new int[]{40, 40, 40, 40}, 40, 4);
    }

    @Test
    void example6() {
        match(new int[]{240}, 240, 1);
    }

    private void match(int[] people, int limit, int ans) {
        assertThat(sut.solution(people, limit), is(ans));
    }

}
