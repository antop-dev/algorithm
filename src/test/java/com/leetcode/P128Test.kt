package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P128Test {
    val p = P128()

    @Test
    fun `example 01`() {
        assertThat(p.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2)), `is`(4))
    }

    @Test
    fun `example 02`() {
        assertThat(p.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)), `is`(9))
    }

}
