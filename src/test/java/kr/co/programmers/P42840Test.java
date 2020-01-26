package kr.co.programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P42840Test {
    private P42840 p;

    @Before
    public void setUp() throws Exception {
        p = new P42840();
    }

    @Test
    public void 입출력예1() {
        assertArrayEquals(new int[]{1}, p.solution(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(new int[]{1}, p.solution(new int[]{1, 2, 3, 4, 5}));
    }
}