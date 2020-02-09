package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P17679Test {
    private final P17679 p = new P17679();

    @Test
    public void 예제1() {
        assertEquals(14, p.solution(4, 5, new String[]{
                "CCBDE",
                "AAADE",
                "AAABF",
                "CCBBF"
        }));
    }

    @Test
    public void 예제2() {
        assertEquals(15, p.solution(6, 6, new String[]{
                "TTTANT",
                "RRFACC",
                "RRRFCC",
                "TRRRAA",
                "TTMMMF",
                "TMMTTJ"
        }));
    }

    @Test
    public void 예제3() {
        assertEquals(0, p.solution(5, 6, new String[]{
                "ABCDEF",
                "GHIJKL",
                "MNOPQR",
                "STUVWX",
                "YZABCD"
        }));
    }

    @Test
    public void 예제4() {
        assertEquals(25, p.solution(5, 5, new String[]{
                "AAAAA",
                "AAAAA",
                "AAAAA",
                "AAAAA",
                "AAAAA"
        }));
    }

    @Test
    public void 예제5() {
        assertEquals(7, p.solution(3, 3, new String[]{
                "AAB",
                "AAA",
                "BAA"
        }));
    }

    @Test
    public void 예제6() {
        assertEquals(7, p.solution(3, 3, new String[]{
                "BAA",
                "AAA",
                "AAB"
        }));
    }
    @Test
    public void 예제7() {
        assertEquals(6, p.solution(3, 4, new String[]{
                "ZXYD",
                "AAAC",
                "AAAC"
        }));
    }

    @Test
    public void 예제8() {
        assertEquals(6, p.solution(3, 4, new String[]{
                "AAZD",
                "AAFC",
                "AAGC"
        }));
    }

    @Test
    public void 예제9() {
        assertEquals(14, p.solution(7, 3, new String[]{
                "ZXC",
                "XXC",
                "BBX",
                "BBB",
                "XBB",
                "AXX",
                "FAA"
        }));
    }

}