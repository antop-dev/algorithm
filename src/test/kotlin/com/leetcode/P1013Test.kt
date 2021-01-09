package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1013Test {
    val p = P1013()

    @Test
    fun `example 01`() {
        assertThat(p.canThreePartsEqualSum(intArrayOf(0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1)), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.canThreePartsEqualSum(intArrayOf(0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1)), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.canThreePartsEqualSum(intArrayOf(3, 3, 6, 5, -2, 2, 5, 1, -9, 4)), `is`(true))
    }

    @Test
    fun `example 04`() {
        assertThat(p.canThreePartsEqualSum(intArrayOf(1, 1, 1)), `is`(true))
    }

    @Test
    fun `example 05`() {
        assertThat(p.canThreePartsEqualSum(intArrayOf(1, 0, 1)), `is`(false))
    }

    @Test
    fun `example 06`() {
        assertThat(p.canThreePartsEqualSum(intArrayOf(10, -10, 10, -10, 10, -10, 10, -10)), `is`(true))
    }


}
