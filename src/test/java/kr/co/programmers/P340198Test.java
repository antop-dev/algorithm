package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P340198Test {
    private final P340198 sut = new P340198();

    @Test
    void example01() {
        assertThat(
                sut.solution(
                        new int[]{5, 3, 2},
                        new String[][]{
                                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                        }
                ),
                is(3)
        );
    }

    @Test
    void example02() {
        assertThat(
                sut.solution(
                        new int[]{3},
                        new String[][]{
                                {"-1", "-1", "-1"},
                                {"-1", "-1", "-1"},
                                {"-1", "-1", "A"},
                        }
                ),
                is(-1)
        );
    }

    @Test
    void example03() {
        assertThat(
                sut.solution(
                        new int[]{1},
                        new String[][]{
                                {"A"},
                        }
                ),
                is(-1)
        );
    }

    @Test
    void example04() {
        assertThat(
                sut.solution(
                        new int[]{1},
                        new String[][]{
                                {"A", "-1"},
                        }
                ),
                is(1)
        );
    }

    @Test
    void example05() {
        assertThat(
                sut.solution(
                        new int[]{3},
                        new String[][]{
                                {"A", "-1", "-1"},
                                {"-1", "-1", "-1"},
                                {"-1", "-1", "-1"},
                                {"-1", "-1", "-1"},
                        }
                ),
                is(3)
        );
    }

    @Test
    void example06() {
        assertThat(
                sut.solution(
                        new int[]{1, 2, 3},
                        new String[][]{
                                {"A", "-1", "-1"},
                                {"-1", "-1", "B"},
                                {"-1", "-1", "-1"},
                        }
                ),
                is(2)
        );
    }

    @Test
    void example07() {
        assertThat(
                sut.solution(
                        new int[]{1, 2},
                        new String[][]{
                                {"A", "-1"},
                                {"A", "-1"},
                        }
                ),
                is(1)
        );
    }

    @Test
    void example08() {
        assertThat(
                sut.solution(
                        new int[]{2},
                        new String[][]{
                                {"A", "-1"},
                                {"A", "-1"},
                        }
                ),
                is(-1)
        );
    }

    @Test
    void example09() {
        assertThat(
                sut.solution(
                        new int[]{2},
                        new String[][]{
                                {"-1", "-1", "-1"},
                        }
                ),
                is(-1)
        );
    }

    @Test
    void example10() {
        assertThat(
                sut.solution(
                        new int[]{3},
                        new String[][]{
                                {"-1", "-1", "A"},
                                {"-1", "-1", "-1"},
                                {"-1", "-1", "-1"},
                        }
                ),
                is(-1)
        );
    }

    @Test
    void example11() {
        assertThat(
                sut.solution(
                        new int[]{1, 5},
                        new String[][]{
                                {"A", "-1"},
                                {"A", "-1"},
                        }
                ),
                is(1)
        );
    }
}
