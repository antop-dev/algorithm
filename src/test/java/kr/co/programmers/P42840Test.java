package kr.co.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P42840Test {
    private P42840 p;

    @BeforeEach
    public void setUp() throws Exception {
        p = new P42840();
    }

    @Test
    public void example01() {
        assertArrayEquals(new int[]{1}, p.solution(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void example02() {
        assertArrayEquals(new int[]{1}, p.solution(new int[]{1, 2, 3, 4, 5}));
    }
}
