package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P42860Test {
    private final P42860 p = new P42860();

    @Test
    public void 예제1() {
        assertEquals(56, p.solution("JEROEN"));
    }

    @Test
    public void 예제2() {
        assertEquals(23, p.solution("JAN"));
    }

    @Test
    public void 예제3() {
        assertEquals(11, p.solution("JAZ"));
    }

    @Test
    public void 예제4() {
        // 10 (x)
        // 11 (o)
        assertEquals(11, p.solution("ABABAAAAAAABA"));
    }

    @Test
    public void 예제5() {
        assertEquals(3, p.solution("AAABA"));
    }

    @Test
    public void 예제6() {
        assertEquals(7, p.solution("AAAZAAZA"));
    }

    @Test
    public void 예제7() {
        assertEquals(5, p.solution("AZAAAZ"));
    }

    @Test
    public void 예제8() {
        assertEquals(0, p.solution("AAAAAAAAAAAA"));
    }

    @Test
    public void 예제9() {
        assertEquals(9, p.solution("ABABAABA"));
    }

    @Test
    public void 예제10() {
        assertEquals(6, p.solution("AABAAAAAAAB"));
    }

    @Test
    public void 예제11() {
        assertEquals(6, p.solution("AAAZAAZ"));
    }

}