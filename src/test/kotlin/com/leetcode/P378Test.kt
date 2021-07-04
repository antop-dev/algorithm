package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P378Test {
    val p = P378()

    @Test
    fun `example 01`() {
        assertThat(
            p.kthSmallest(
                matrix = arrayOf(
                    intArrayOf(1, 5, 9),
                    intArrayOf(10, 11, 13),
                    intArrayOf(12, 13, 15)
                ),
                k = 8
            ), `is`(13)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.kthSmallest(
                matrix = arrayOf(
                    intArrayOf(-5)
                ),
                k = 1
            ), `is`(-5)
        )
    }

}
