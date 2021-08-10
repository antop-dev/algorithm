package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

// https://github.com/antop-dev/algorithm/issues/308
class P15Test {
    val p = P15()

    @Test
    fun `example 01`() {
        assertThat(
            p.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)),
            `is`(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.threeSum(intArrayOf()),
            `is`(listOf())
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.threeSum(intArrayOf(0)),
            `is`(listOf())
        )
    }
}
