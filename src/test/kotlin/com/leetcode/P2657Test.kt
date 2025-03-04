package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2657Test {
    val sut = P2657()

    @Test
    fun `example 01`() {
        assertThat(
            sut.findThePrefixCommonArray(
                A = intArrayOf(1, 3, 2, 4),
                B = intArrayOf(3, 1, 2, 4)
            ),
            `is`(intArrayOf(0, 2, 3, 4))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            sut.findThePrefixCommonArray(
                A = intArrayOf(2, 3, 1),
                B = intArrayOf(3, 1, 2)
            ),
            `is`(intArrayOf(0, 1, 3))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            sut.findThePrefixCommonArray(
                A = intArrayOf(
                    20,
                    2,
                    14,
                    19,
                    31,
                    9,
                    30,
                    13,
                    17,
                    33,
                    10,
                    3,
                    26,
                    28,
                    5,
                    8,
                    6,
                    29,
                    22,
                    21,
                    23,
                    4,
                    1,
                    27,
                    24,
                    11,
                    12,
                    18,
                    7,
                    25,
                    32,
                    16,
                    15
                ),
                B = intArrayOf(
                    7,
                    1,
                    3,
                    5,
                    11,
                    2,
                    16,
                    26,
                    4,
                    13,
                    22,
                    23,
                    31,
                    9,
                    18,
                    19,
                    17,
                    8,
                    32,
                    12,
                    24,
                    25,
                    20,
                    28,
                    6,
                    33,
                    14,
                    30,
                    15,
                    21,
                    10,
                    29,
                    27
                )
            ),
            `is`(
                intArrayOf(
                    0,
                    0,
                    0,
                    0,
                    0,
                    1,
                    1,
                    1,
                    1,
                    2,
                    2,
                    3,
                    5,
                    6,
                    7,
                    8,
                    9,
                    10,
                    11,
                    11,
                    12,
                    13,
                    15,
                    16,
                    18,
                    20,
                    22,
                    24,
                    25,
                    27,
                    29,
                    31,
                    33
                )
            )
        )
    }
}
