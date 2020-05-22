package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

// // https://programmers.co.kr/learn/courses/30/lessons/42577
class P42577Test {
    private final P42577 p = new P42577();

    @Test
    void example01() {
        assertThat(p.solution(new String[]{"119", "97674223", "1195524421"}), is(false));
    }

    @Test
    void example02() {
        assertThat(p.solution(new String[]{"123", "456", "789"}), is(true));
    }

    @Test
    void example03() {
        assertThat(p.solution(new String[]{"12", "123", "1235", "567", "88"}), is(false));
    }
}
