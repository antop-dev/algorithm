package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1877Test {
    val p = P1877()

    @Test
    fun `example 01`() {
        assertThat(p.minPairSum(intArrayOf(3, 5, 2, 3)), `is`(7))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minPairSum(intArrayOf(3, 5, 4, 2, 4, 6)), `is`(8))
    }

}
