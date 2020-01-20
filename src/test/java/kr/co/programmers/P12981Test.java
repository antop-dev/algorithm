package kr.co.programmers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12981
 */
public class P12981Test {
    private final P12981 p = new P12981();

    @Test
    public void 입출력예1() {
        assertArrayEquals(new int[]{3, 3},
                p.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})
        );
    }

    @Test
    public void 입출력예2() {
        assertArrayEquals(new int[]{0, 0},
                p.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})
        );
    }

    @Test
    public void 입출력예3() {
        assertArrayEquals(new int[]{1, 3},
                p.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})
        );
    }
}