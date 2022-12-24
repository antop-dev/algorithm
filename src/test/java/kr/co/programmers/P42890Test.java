package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P42890Test {
    private final P42890 p = new P42890();

    @Test
    void example01() {
        assertEquals(2, p.solution(new String[][]{
                {"100", "ryan", "music", "2"},
                {"200", "apeach", "math", "2"},
                {"300", "tube", "computer", "3"},
                {"400", "con", "computer", "4"},
                {"500", "muzi", "music", "3"},
                {"600", "apeach", "music", "2"}
        }));
    }

    @Test
    void example02() {
        assertEquals(1, p.solution(new String[][]{
                {"a", "b", "c"},
                {"1", "b", "c"},
                {"a", "b", "4"},
                {"a", "5", "c"}
        }));
    }

    @Test
    void example03() {
        assertEquals(2, p.solution(new String[][]{
                {"a", "1", "4"},
                {"2", "1", "5"},
                {"a", "2", "4"}
        }));
    }

    @Test
    void example04() {
        assertEquals(1, p.solution(new String[][]{
                {"1"},
                {"2"},
                {"3"}
        }));
    }

    @Test
    void example05() {
        assertEquals(2, p.solution(new String[][]{
                {"1", "a"},
                {"2", "b"},
                {"3", "c"}
        }));
    }

    @Test
    void example06() {
        assertEquals(1, p.solution(new String[][]{
                {"1", "a"},
                {"1", "b"},
                {"2", "b"}
        }));
    }

    @Test
    void example07() {
        assertEquals(2, p.solution(new String[][]{
                {"1", "a", "c"},
                {"1", "b", "d"},
                {"2", "a", "f"},
                {"2", "b", "z"}
        }));
    }

    @Test
    void example08() {
        assertEquals(3, p.solution(new String[][]{
                {"1", "928888", "john", "27"},
                {"1", "929999", "leo", "19"},
                {"2", "007777", "antop", "19"},
                {"2", "986666", "kim", "27"}
        }));
    }

    @Test
    void example09() {
        assertEquals(2, p.solution(new String[][]{
                {"1", "0", "o", "19"},
                {"1", "0", "p", "19"},
                {"2", "0", "p", "21"},
                {"2", "0", "o", "21"}
        }));
    }

    @Test
    void example10() {
        assertEquals(8, p.solution(new String[][]{
                {"a", "b", "c", "d", "e", "f", "g", "h"},
                {"i", "j", "k", "l", "m", "n", "o", "p"},
                {"q", "r", "s", "t", "u", "v", "w", "x"},
                {"y", "z", "0", "1", "2", "3", "4", "5"}
        }));
    }

}
