package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P633Test {
    val p = P633()

    @Test
    fun `example 01`() {
        assertThat(p.judgeSquareSum(5), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.judgeSquareSum(3), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.judgeSquareSum(4), `is`(true))
    }

    @Test
    fun `example 04`() {
        assertThat(p.judgeSquareSum(2), `is`(true))
    }

    @Test
    fun `example 05`() {
        assertThat(p.judgeSquareSum(1), `is`(true))
    }

    @Test
    fun `example 06`() {
        // a = 1200
        // b = 31600
        assertThat(p.judgeSquareSum(1_000_000_000), `is`(true))
    }

    @Test
    fun `example 07`() {
        assertThat(p.judgeSquareSum(999_999_999), `is`(false))
    }

    @Test
    fun `example 08`() {
        assertThat(p.judgeSquareSum(Int.MAX_VALUE), `is`(false))
    }

    @Test
    fun `example 09`() {
        // a = 7060
        // b = 45800
        assertThat(p.judgeSquareSum(2_147_483_600), `is`(true))
    }

}
