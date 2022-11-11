package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P17683Test {
    private final P17683 sut = new P17683();

    @Test
    void example01() {
        assertThat(sut.solution("ABCDEFG", new String[]{
                "12:00,12:14,HELLO,CDEFGAB",
                "3:00,13:05,WORLD,ABCDEF"
        }), is("HELLO"));
    }

    @Test
    void example02() {
        assertThat(sut.solution("CC#BCC#BCC#BCC#B", new String[]{
                "03:00,03:30,FOO,CC#B",
                "04:00,04:08,BAR,CC#BCC#BCC#B"
        }), is("FOO"));
    }

    @Test
    void example03() {
        assertThat(sut.solution("ABC", new String[]{
                "12:00,12:14,HELLO,C#DEFGAB",
                "13:00,13:05,WORLD,ABCDEFB"
        }), is("WORLD"));
    }

    @Test
    void example04() {
        // 조건이 일치하는 음악이 여러 개일 때에는 라디오에서 재생된 시간이 제일 긴 음악 제목을 반환한다.
        assertThat(sut.solution("ABC", new String[]{
                "13:00,13:10,HELLO,ABC",
                "13:00,13:20,WORLD,ABC"
        }), is("WORLD"));
    }

    @Test
    void example05() {
        // 재생된 시간도 같을 경우 먼저 입력된 음악 제목을 반환한다.
        assertThat(sut.solution("ABC", new String[]{
                "13:00,13:20,HELLO,CCC",
                "13:00,13:10,HELLO,ABC",
                "13:00,13:10,WORLD,ABC"
        }), is("HELLO"));
    }

    @Test
    void example06() {
        assertThat(sut.solution("CCB", new String[]{
                "03:00,03:10,FOO,CCB#CCB",
                "04:00,04:08,BAR,ABC"
        }), is("FOO"));
    }

    @Test
    void example07() {
        assertThat(sut.solution("ABC", new String[]{
                "12:00,12:14,HELLO,CDEFGAB",
                "13:00,13:14,WORLD,ABCDEF"
        }), is("HELLO"));
    }

}
