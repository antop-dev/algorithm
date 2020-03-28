package com.leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

// https://leetcode.com/problems/remove-element/
internal class P27Test {
    val p = P27()

    @Test
    fun `example 1`() {
        val nums = intArrayOf(3, 2, 2, 3)
        assertEquals(2, p.removeElement(nums, 3))
        assertEquals(2, nums[0])
        assertEquals(2, nums[1])
    }

    @Test
    fun `example 2`() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        assertEquals(5, p.removeElement(nums, 2))
        assertEquals(0, nums[0])
        assertEquals(1, nums[1])
        assertEquals(3, nums[2])
        assertEquals(0, nums[3])
        assertEquals(4, nums[4])
    }
}