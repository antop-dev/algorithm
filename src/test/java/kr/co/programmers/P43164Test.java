package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P43164Test {
    private P43164 p = new P43164();

    @Test
    public void 입출력예제1() {
        assertArrayEquals(
                new String[]{"ICN", "JFK", "HND", "IAD"},
                p.solution(new String[][]{
                        {"ICN", "JFK"},
                        {"HND", "IAD"},
                        {"JFK", "HND"}
                })
        );
    }

    @Test
    public void 입출력예제2() {
        assertArrayEquals(
                new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"},
                p.solution(new String[][]{
                        {"ICN", "SFO"},
                        {"ICN", "ATL"},
                        {"SFO", "ATL"},
                        {"ATL", "ICN"},
                        {"ATL", "SFO"}
                })
        );
    }

    @Test
    public void 입출력예제3() {
        assertArrayEquals(
                new String[]{"ICN", "COO", "ICN", "BOO"},
                p.solution(new String[][]{
                        {"ICN", "BOO"},
                        {"ICN", "COO"},
                        {"COO", "ICN"}
                })
        );
    }

    @Test
    public void 입출력예제4() {
        assertArrayEquals(
                new String[]{"ICN", "COO", "ICN", "BOO", "DOO"},
                p.solution(new String[][]{
                        {"ICN", "COO"},
                        {"ICN", "BOO"},
                        {"COO", "ICN"},
                        {"BOO", "DOO"}
                })
        );
    }

    @Test
    public void 입출력예제5() {
        assertArrayEquals(
                new String[]{"ICN", "BOO", "COO", "DOO", "GOO", "HOO", "DOO", "EOO", "FOO", "ICN"},
                p.solution(new String[][]{
                        {"ICN", "BOO"},
                        {"BOO", "COO"},
                        {"COO", "DOO"},
                        {"DOO", "EOO"},
                        {"EOO", "FOO"},
                        {"FOO", "ICN"},
                        {"DOO", "GOO"},
                        {"GOO", "HOO"},
                        {"HOO", "DOO"},
                })
        );
    }

}
