package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P16Test {
    private final P16 p = new P16();

    @Test
    void example01() {
        assertThat(p.threeSumClosest(new int[]{-1, 2, 1, -4}, 1), is(2));
    }

    @Test
    void example02() {
        assertThat(p.threeSumClosest(new int[]{0, 0, 0}, 1), is(0));
    }

    @Test
    void example03() {
        assertThat(p.threeSumClosest(new int[]{0, 1, 2}, 3), is(3));
    }

    @Test
    void example04() {
        assertThat(p.threeSumClosest(new int[]{0, 2, 1, -3}, 1), is(0));
    }

    @Test
    void example05() {
        assertThat(p.threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1), is(-2));
    }
}
