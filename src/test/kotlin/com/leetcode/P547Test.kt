package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P547Test {
    val sut = P547()

    @Test
    fun `example 1`() {
        assertThat(
            sut.findCircleNum(
                arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 0, 1)
                )
            ), `is`(2)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.findCircleNum(
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(0, 1, 0),
                    intArrayOf(0, 0, 1)
                )
            ), `is`(3)
        )
    }

}
