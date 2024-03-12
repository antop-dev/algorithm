package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P49993Test {
    private final P49993 sut = new P49993();

    @Test
    void example1() {
        assertThat(
                sut.solution("CBD", new String[]{"BADE", "CBADF", "AECB", "BDA"}),
                is(2)
        );
    }

}
