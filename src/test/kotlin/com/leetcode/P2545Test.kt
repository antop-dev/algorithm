package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2545Test {
    val sut = P2545()

    @Test
    fun `example 1`() {
        val score = arrayOf(
            intArrayOf(10, 6, 9, 1),
            intArrayOf(7, 5, 11, 2),
            intArrayOf(4, 8, 3, 15),
        )

        assertThat(
            sut.sortTheStudents(score, 2),
            `is`(
                arrayOf(
                    intArrayOf(7, 5, 11, 2),
                    intArrayOf(10, 6, 9, 1),
                    intArrayOf(4, 8, 3, 15),
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        val score = arrayOf(
            intArrayOf(3, 4),
            intArrayOf(5, 6),
        )

        assertThat(
            sut.sortTheStudents(score, 0),
            `is`(
                arrayOf(
                    intArrayOf(5, 6),
                    intArrayOf(3, 4),
                )
            )
        )
    }
}
