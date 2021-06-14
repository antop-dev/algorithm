package com.leetcode

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P48Test {
    val p = P48()

    @Test
    fun `example 01`() {
        val input = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )

        p.rotate(input)

        MatcherAssert.assertThat(
            input,
            `is`(
                arrayOf(
                    intArrayOf(7, 4, 1),
                    intArrayOf(8, 5, 2),
                    intArrayOf(9, 6, 3)
                )
            )
        )
    }

    @Test
    fun `example 02`() {
        val input = arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16)
        )

        p.rotate(input)

        MatcherAssert.assertThat(
            input,
            `is`(
                arrayOf(
                    intArrayOf(15, 13, 2, 5),
                    intArrayOf(14, 3, 4, 1),
                    intArrayOf(12, 6, 8, 9),
                    intArrayOf(16, 7, 10, 11)
                )
            )
        )
    }

    @Test
    fun `example 03`() {
        val input = arrayOf(intArrayOf(1))
        p.rotate(input)
        MatcherAssert.assertThat(
            input,
            `is`(arrayOf(intArrayOf(1)))
        )
    }

    @Test
    fun `example 04`() {
        val input = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )

        p.rotate(input)

        MatcherAssert.assertThat(
            input,
            `is`(
                arrayOf(
                    intArrayOf(3, 1),
                    intArrayOf(4, 2)
                )
            )
        )
    }

    @Test
    fun `example 05`() {
        val input = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(6, 7, 8, 9, 10),
            intArrayOf(11, 12, 13, 14, 15),
            intArrayOf(16, 17, 18, 19, 20),
            intArrayOf(21, 22, 23, 24, 25)
        )

        p.rotate(input)

        MatcherAssert.assertThat(
            input,
            `is`(
                arrayOf(
                    intArrayOf(21, 16, 11, 6, 1),
                    intArrayOf(22, 17, 12, 7, 2),
                    intArrayOf(23, 18, 13, 8, 3),
                    intArrayOf(24, 19, 14, 9, 4),
                    intArrayOf(25, 20, 15, 10, 5)
                )
            )
        )
    }

}
