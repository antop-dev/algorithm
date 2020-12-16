package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/17681
 */
public class P17681Test {
    private P17681 p = new P17681();

    @Test
    public void 입출력예제1() {
        assertArrayEquals(
                new String[]{
                        "#####",
                        "# # #",
                        "### #",
                        "#  ##",
                        "#####"
                },
                p.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})
        );
    }

    @Test
    public void 입출력예제2() {
        assertArrayEquals(
                new String[]{
                        "######",
                        "###  #",
                        "##  ##",
                        " #### ",
                        " #####",
                        "### # "
                },
                p.solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})
        );
    }
}
