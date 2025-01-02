package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3249Test {
    val sut = P3249()

    @Test
    fun `example 1`() {
        assertThat(
            sut.countGoodNodes(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 3),
                    intArrayOf(1, 4),
                    intArrayOf(2, 5),
                    intArrayOf(2, 6),
                )
            ), `is`(7)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.countGoodNodes(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(3, 4),
                    intArrayOf(0, 5),
                    intArrayOf(1, 6),
                    intArrayOf(2, 7),
                    intArrayOf(3, 8),
                )
            ), `is`(6)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.countGoodNodes(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 2),
                    intArrayOf(1, 3),
                    intArrayOf(1, 4),
                    intArrayOf(0, 5),
                    intArrayOf(5, 6),
                    intArrayOf(6, 7),
                    intArrayOf(7, 8),
                    intArrayOf(0, 9),
                    intArrayOf(9, 10),
                    intArrayOf(9, 12),
                    intArrayOf(10, 11),
                )
            ), `is`(12)
        )
    }


    @Test
    fun `example 4`() {
        assertThat(
            sut.countGoodNodes(
                arrayOf(
                    intArrayOf(6, 0),
                    intArrayOf(1, 0),
                    intArrayOf(5, 1),
                    intArrayOf(2, 5),
                    intArrayOf(3, 1),
                    intArrayOf(4, 3),

                    )
            ), `is`(6)
        )
    }
}
