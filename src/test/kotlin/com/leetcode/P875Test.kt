package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P875Test {
    val p = P875()

    @Test
    fun `example 01`() {
        assertThat(p.minEatingSpeed(intArrayOf(3, 6, 7, 11), 8), `is`(4))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 5), `is`(30))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 6), `is`(23))
    }
    @Test
    fun `example 04`() {
        assertThat(p.minEatingSpeed(intArrayOf(312884470), 312884469), `is`(2))
    }

}
