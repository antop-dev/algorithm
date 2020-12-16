package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P17678BTest {
    private final P17678B p = new P17678B();

    @Test
    public void 예제1() {
        assertEquals("09:00", p.solution(1, 1, 5,
                new String[]{"08:00", "08:01", "08:02", "08:03"})
        );
    }

    @Test
    public void 예제2() {
        assertEquals("09:09", p.solution(2, 10, 2,
                new String[]{"09:10", "09:09", "08:00"})
        );
    }

    @Test
    public void 예제3() {
        assertEquals("08:59", p.solution(2, 1, 2,
                new String[]{"09:00", "09:00", "09:00", "09:00"})
        );
    }

    @Test
    public void 예제4() {
        assertEquals("00:00", p.solution(1, 1, 5,
                new String[]{"00:01", "00:01", "00:01", "00:01", "00:01"})
        );
    }

    @Test
    public void 예제5() {
        assertEquals("09:00", p.solution(1, 1, 1, new String[]{"23:59"}));
    }

    @Test
    public void 예제6() {
        assertEquals("18:00", p.solution(10, 60, 45,
                new String[]{"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59",
                        "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"})
        );
    }

    @Test
    public void 예제7() {
        assertEquals("09:10", p.solution(2, 10, 3,
                new String[]{"09:00", "09:00", "09:00", "09:10"})
        );
    }

    @Test
    public void 예제8() {
        assertEquals("09:07", p.solution(2, 10, 2,
                new String[]{"09:00", "09:00", "09:10", "09:05", "09:08"})
        );
    }

}
