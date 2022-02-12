package com.leetcode;

import org.junit.jupiter.api.Test;
import utils.FileUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

class P1743Test {
    private final P1743 p = new P1743();

    @Test
    void example01() {
        assertThat(
                p.restoreArray(new int[][]{{2, 1}, {3, 4}, {3, 2}}),
                anyOf(
                        is(new int[]{1, 2, 3, 4}),
                        is(new int[]{4, 3, 2, 1})
                )
        );
    }

    @Test
    void example02() {
        assertThat(
                p.restoreArray(new int[][]{{4, -2}, {1, 4}, {-3, 1}}),
                anyOf(
                        is(new int[]{-2, 4, 1, -3}),
                        is(new int[]{-3, 1, 4, -2})
                )
        );
    }

    @Test
    void example03() {
        assertThat(
                p.restoreArray(new int[][]{{100000, -100000}}),
                anyOf(
                        is(new int[]{100000, -100000}),
                        is(new int[]{-100000, 100000})
                )
        );
    }

    @Test
    void example04() {
        int[][] array = FileUtils.readFile("src/test/resources/com/leetcode/p1743-04.txt", 0, int[][].class);
        int[] expected = FileUtils.readFile("src/test/resources/com/leetcode/p1743-04.txt", 1, int[].class);
        assertThat(p.restoreArray(array), is(expected));
    }

    @Test
    void example05() {
        int[][] array = FileUtils.readFile("src/test/resources/com/leetcode/p1743-05.txt", 0, int[][].class);
        int[] expected = FileUtils.readFile("src/test/resources/com/leetcode/p1743-05.txt", 1, int[].class);
        assertThat(p.restoreArray(array), is(expected));
    }

}
