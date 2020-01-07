package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 */
public class P17682Test {
    private P17682 p = new P17682();

    @Test
    public void 입출력예제1() {
        assertEquals(37, p.solution("1S2D*3T"));
    }

    @Test
    public void 입출력예제2() {
        assertEquals(9, p.solution("1D2S#10S"));
    }

    @Test
    public void 입출력예제3() {
        assertEquals(3, p.solution("1D2S0T"));
    }

    @Test
    public void 입출력예제4() {
        assertEquals(23, p.solution("1S*2T*3S"));
    }

    @Test
    public void 입출력예제5() {
        assertEquals(5, p.solution("1D#2S*3S"));
    }

    @Test
    public void 입출력예제6() {
        assertEquals(-4, p.solution("1T2D3D#"));
    }

    @Test
    public void 입출력예제7() {
        assertEquals(59, p.solution("1D2S3T*"));
    }

}