package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P86971Test {
    private final P86971 p = new P86971();

    @Test
    void example01() {
        assertThat(p.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}}), is(3));
    }

    @Test
    void example02() {
        assertThat(p.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}}), is(0));
    }

    @Test
    void example03() {
        assertThat(p.solution(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}}), is(1));
    }

}
