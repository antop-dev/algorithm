package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1631Test {
    val sut = P1631()

    @Test
    fun `example 1`() {
        val ans = sut.minimumEffortPath(
            arrayOf(
                intArrayOf(1, 2, 2),
                intArrayOf(3, 8, 2),
                intArrayOf(5, 3, 5)
            )
        )
        assertThat(ans, `is`(2))
    }

    @Test
    fun `example 2`() {
        val ans = sut.minimumEffortPath(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(3, 8, 4),
                intArrayOf(5, 3, 5)
            )
        )
        assertThat(ans, `is`(1))
    }

    @Test
    fun `example 3`() {
        val ans = sut.minimumEffortPath(
            arrayOf(
                intArrayOf(1, 2, 1, 1, 1),
                intArrayOf(1, 2, 1, 2, 1),
                intArrayOf(1, 2, 1, 2, 1),
                intArrayOf(1, 2, 1, 2, 1),
                intArrayOf(1, 1, 1, 2, 1)
            )
        )
        assertThat(ans, `is`(0))
    }

    @Test
    fun `example 4`() {
        val ans = sut.minimumEffortPath(
            arrayOf(intArrayOf(100))
        )
        assertThat(ans, `is`(0))
    }

    @Test
    fun `example 5`() {
        val ans = sut.minimumEffortPath(
            arrayOf(
                intArrayOf(4, 3, 4, 10, 5, 5, 9, 2),
                intArrayOf(10, 8, 2, 10, 9, 7, 5, 6),
                intArrayOf(5, 8, 10, 10, 10, 7, 4, 2),
                intArrayOf(5, 1, 3, 1, 1, 3, 1, 9),
                intArrayOf(6, 4, 10, 6, 10, 9, 4, 6)
            )
        )
        assertThat(ans, `is`(5))
    }

}
