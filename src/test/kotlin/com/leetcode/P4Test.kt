package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P4Test {
    val p = P4()

    @Test
    fun `example 01`() {
        val nums1 = intArrayOf(1, 3)
        val nums2 = intArrayOf(2)

        assertThat(p.findMedianSortedArrays(nums1, nums2), `is`(2.0))
    }

    @Test
    fun `example 02`() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3, 4)

        assertThat(p.findMedianSortedArrays(nums1, nums2), `is`(2.5))
    }

    @Test
    fun `example 03`() {
        val nums1 = intArrayOf(3)
        val nums2 = intArrayOf(-2, -1)

        assertThat(p.findMedianSortedArrays(nums1, nums2), `is`(-1.0))
    }

    @Test
    fun `example 04`() {
        val nums1 = intArrayOf()
        val nums2 = intArrayOf(1)

        assertThat(p.findMedianSortedArrays(nums1, nums2), `is`(1.0))
    }

    @Test
    fun `example 05`() {
        val nums1 = intArrayOf()
        val nums2 = intArrayOf(2,3)

        assertThat(p.findMedianSortedArrays(nums1, nums2), `is`(2.5))
    }
}
