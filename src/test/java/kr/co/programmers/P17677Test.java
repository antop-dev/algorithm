package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P17677Test {
    private final P17677 sut = new P17677();

    @Test
    void example1() {
        assertSolution("FRANCE", "french", 16_384);
    }

    @Test
    void example2() {
        assertSolution("handshake", "shake hands", 65_536);
    }

    @Test
    void example3() {
        assertSolution("aa1+aa2", "AAAA12", 43_690);
    }

    @Test
    void example4() {
        assertSolution("E=M*C^2", "e=m*c^2", 65_536);
    }

    @Test
    void example5() {
        assertSolution("AAbbaa_AAbb", "BBB", 16_384);
    }

    @Test
    void example6() {
        assertSolution("BAAAA", "AAA", 32_768);
    }

    @Test
    void example7() {
        assertSolution("A+C", "DEF", 0);
    }

    private void assertSolution(String str1, String str2, int ans) {
        assertThat(sut.solution(str1, str2), is(ans));
    }
}
