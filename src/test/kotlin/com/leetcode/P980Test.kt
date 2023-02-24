package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P980Test {
    val sut = P980()

    @Test
    fun `example 1`() {
        assertThat(
            sut.uniquePathsIII(
                arrayOf(
                    intArrayOf(1, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0),
                    intArrayOf(0, 0, 2, -1)
                )
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.uniquePathsIII(
                arrayOf(
                    intArrayOf(1, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 2)
                )
            ),
            `is`(4)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.uniquePathsIII(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(2, 0)
                )
            ),
            `is`(0)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.uniquePathsIII(
                arrayOf(
                    intArrayOf(1, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 2)
                )
            ),
            `is`(20)
        )
    }

}
