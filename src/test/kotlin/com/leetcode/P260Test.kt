package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.arrayContainingInAnyOrder
import org.junit.jupiter.api.Test

class P260Test {
    val p = P260()

    @Test
    fun `example 01`() {
        assertThat(p.singleNumber(intArrayOf(1, 2, 1, 3, 2, 5)).toTypedArray(), arrayContainingInAnyOrder(3, 5))
    }

    @Test
    fun `example 02`() {
        assertThat(p.singleNumber(intArrayOf(-1, 0)).toTypedArray(), arrayContainingInAnyOrder(-1, 0))
    }

    @Test
    fun `example 03`() {
        assertThat(p.singleNumber(intArrayOf(0, 1)).toTypedArray(), arrayContainingInAnyOrder(1, 0))
    }

}
