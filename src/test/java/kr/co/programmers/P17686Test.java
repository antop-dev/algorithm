package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P17686Test {
    private final P17686 sut = new P17686();

    @Test
    void example1() {
        var input = new String[]{
                "img12.png",
                "img10.png",
                "img02.png",
                "img1.png",
                "IMG01.GIF",
                "img2.JPG",
        };
        var output = new String[]{
                "img1.png",
                "IMG01.GIF",
                "img02.png",
                "img2.JPG",
                "img10.png",
                "img12.png",
        };
        assertThat(sut.solution(input), is(output));
    }

    @Test
    void example2() {
        var input = new String[]{
                "F-5 Freedom Fighter",
                "B-50 Superfortress",
                "A-10 Thunderbolt II",
                "F-14 Tomcat",
        };
        var output = new String[]{
                "A-10 Thunderbolt II",
                "B-50 Superfortress",
                "F-5 Freedom Fighter",
                "F-14 Tomcat",
        };
        assertThat(sut.solution(input), is(output));
    }
}
