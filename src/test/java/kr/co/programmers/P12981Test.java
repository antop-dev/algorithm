package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P12981Test {
    private final P12981 sut = new P12981();

    @Test
    void example01() {
        assertThat(
                sut.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}),
                is(new int[]{3, 3})
        );
    }

    @Test
    void example02() {
        assertThat(
                sut.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}),
                is(new int[]{0, 0})
        );
    }

    @Test
    void example03() {
        assertThat(
                sut.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}),
                is(new int[]{1, 3})
        );
    }
}
