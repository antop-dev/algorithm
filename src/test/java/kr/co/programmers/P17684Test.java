package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P17684Test {
    private final P17684 sut = new P17684();

    @Test
    void example1() {
        assertThat(
                sut.solution("KAKAO"),
                is(new int[]{11, 1, 27, 15})
        );
    }

    @Test
    void example2() {
        assertThat(
                sut.solution("TOBEORNOTTOBEORTOBEORNOT"),
                is(new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34})
        );
    }

    @Test
    void example3() {
        assertThat(
                sut.solution("ABABABABABABABAB"),
                is(new int[]{1, 2, 27, 29, 28, 31, 30})
        );
    }
}
