package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P88Test {
    val p = P88()

    @Test
    fun merge() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val nums2 = intArrayOf(2, 5, 6)
        p.merge(nums1, 3, nums2, 3)
        assertThat(nums1, `is`(intArrayOf(1, 2, 2, 3, 5, 6)))
    }
}