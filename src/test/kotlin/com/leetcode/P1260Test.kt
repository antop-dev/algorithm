package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1260Test {
    val p = P1260()

    @Test
    fun `example 01`() {
        assertThat(
            p.shiftGrid(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9)
                ), 1
            ), `is`(
                listOf(
                    listOf(9, 1, 2),
                    listOf(3, 4, 5),
                    listOf(6, 7, 8)
                )
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.shiftGrid(
                arrayOf(
                    intArrayOf(3, 8, 1, 9),
                    intArrayOf(19, 7, 2, 5),
                    intArrayOf(4, 6, 11, 10),
                    intArrayOf(12, 0, 21, 13)
                ), 4
            ), `is`(
                listOf(
                    listOf(12, 0, 21, 13),
                    listOf(3, 8, 1, 9),
                    listOf(19, 7, 2, 5),
                    listOf(4, 6, 11, 10)
                )
            )
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.shiftGrid(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9)
                ), 9
            ), `is`(
                listOf(
                    listOf(1, 2, 3),
                    listOf(4, 5, 6),
                    listOf(7, 8, 9)
                )
            )
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.shiftGrid(
                arrayOf(
                    intArrayOf(1),
                    intArrayOf(2),
                    intArrayOf(3),
                    intArrayOf(4),
                    intArrayOf(7),
                    intArrayOf(6),
                    intArrayOf(5)
                ), 23
            ), `is`(
                listOf(
                    listOf(6),
                    listOf(5),
                    listOf(1),
                    listOf(2),
                    listOf(3),
                    listOf(4),
                    listOf(7)
                )
            )
        )
    }
}
