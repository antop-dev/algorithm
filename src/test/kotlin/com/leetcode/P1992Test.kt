package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1992Test {
    val sut = P1992()

    @Test
    fun `example 1`() {
        assertThat(
            sut.findFarmland(
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(0, 1, 1),
                    intArrayOf(0, 1, 1),
                )
            ), `is`(
                arrayOf(
                    intArrayOf(0, 0, 0, 0),
                    intArrayOf(1, 1, 2, 2),
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.findFarmland(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                )
            ), `is`(
                arrayOf(
                    intArrayOf(0, 0, 1, 1),
                )
            )
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.findFarmland(
                arrayOf(
                    intArrayOf(0),
                )
            ), `is`(
                arrayOf()
            )
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.findFarmland(
                arrayOf(
                    intArrayOf(1, 1, 0, 1, 1),
                    intArrayOf(1, 1, 0, 1, 1),
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(1, 1, 0, 1, 1),
                    intArrayOf(1, 1, 0, 1, 1),
                )
            ), `is`(
                arrayOf(
                    intArrayOf(0, 0, 1, 1),
                    intArrayOf(0, 3, 1, 4),
                    intArrayOf(3, 0, 4, 1),
                    intArrayOf(3, 3, 4, 4),
                )
            )
        )
    }
}