package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P64065Test {
    private final P64065 p = new P64065();

    @Test
    void example01() {
        assertThat(p.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"), is(new int[]{2, 1, 3, 4}));
    }

    @Test
    void example02() {
        assertThat(p.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"), is(new int[]{2, 1, 3, 4}));
    }

    @Test
    void example03() {
        assertThat(p.solution("{{20,111},{111}}"), is(new int[]{111, 20}));
    }

    @Test
    void example04() {
        assertThat(p.solution("{{123}}"), is(new int[]{123}));
    }

    @Test
    void example05() {
        assertThat(p.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"), is(new int[]{3, 2, 4, 1}));
    }

}
