package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1247Test {
    val p = P1247()

    @Test
    fun `example 01`() {
        assertThat(p.minimumSwap("xx", "yy"), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minimumSwap("xy", "yx"), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minimumSwap("xx", "xy"), `is`(-1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.minimumSwap("xxyyxyxyxx", "xyyxyxxxyx"), `is`(4))
    }

}
