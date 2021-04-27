package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12973Test {
    private final P12973 p = new P12973();

    @Test
    void example01() {
        assertThat(p.solution("baabaa"), is(1));
    }

    @Test
    void example02() {
        assertThat(p.solution("cdcd"), is(0));
    }

}
