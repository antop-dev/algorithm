package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1314Test {
    val p = P1314()

    @Test
    fun `example 01`() {
        assertThat(
            p.matrixBlockSum(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9)
                ), 1
            ), `is`(
                arrayOf(
                    intArrayOf(12, 21, 16),
                    intArrayOf(27, 45, 33),
                    intArrayOf(24, 39, 28)
                )
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.matrixBlockSum(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9)
                ), 2
            ), `is`(
                arrayOf(
                    intArrayOf(45, 45, 45),
                    intArrayOf(45, 45, 45),
                    intArrayOf(45, 45, 45)
                )
            )
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.matrixBlockSum(
                arrayOf(
                    intArrayOf(1, 2, 3, 4, 5),
                    intArrayOf(6, 7, 8, 9, 10),
                    intArrayOf(11, 12, 13, 14, 15),
                    intArrayOf(16, 17, 18, 19, 20),
                    intArrayOf(21, 22, 23, 24, 25)
                ), 1
            ), `is`(
                arrayOf(
                    intArrayOf(16, 27, 33, 39, 28),
                    intArrayOf(39, 63, 72, 81, 57),
                    intArrayOf(69, 108, 117, 126, 87),
                    intArrayOf(99, 153, 162, 171, 117),
                    intArrayOf(76, 117, 123, 129, 88)
                )
            )
        )
    }
}
