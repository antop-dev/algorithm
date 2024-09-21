package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P42626Test {
    private final P42626 sut = new P42626();

    @Test
    void example1() {
        var scoville = new int[]{1, 2, 3, 9, 10, 12};
        var k = 7;
        assertThat(sut.solution(scoville, k), is(2));
    }

    @Test
    void example2() {
        var scoville = new int[]{1, 2};
        var k = 100;
        assertThat(sut.solution(scoville, k), is(-1));
    }

    @Test
    void example3() {
        var scoville = new int[]{3, 8};
        var k = 8;
        assertThat(sut.solution(scoville, k), is(1));
    }

}
