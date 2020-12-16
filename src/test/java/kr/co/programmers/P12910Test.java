package kr.co.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P12910Test {
    private P12910 p;

    @BeforeEach
    public void setUp() {
        p = new P12910();
    }

    @Test
    public void 입출력예1() {
        assertArrayEquals(new int[]{5, 10}, p.solution(new int[]{5, 9, 7, 10}, 5));
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(new int[]{1, 2, 3, 36}, p.solution(new int[]{2, 36, 1, 3}, 1));
    }

    @Test
    public void 입출력예3() {
        assertArrayEquals(new int[]{-1}, p.solution(new int[]{3, 2, 6}, 10));
    }
}
