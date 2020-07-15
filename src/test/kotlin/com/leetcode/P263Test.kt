package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P263Test {
    val p = P263()

    @Test
    fun `example 01`() {
        assertThat(p.isUgly(6), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.isUgly(8), `is`(true))
    }

    @Test
    fun `example 03`() {
        assertThat(p.isUgly(14), `is`(false))
    }

    @Test
    fun `example 04`() {
        assertThat(p.isUgly(Int.MAX_VALUE), `is`(false))
    }

    @Test
    fun `example 05`() {
        assertThat(p.isUgly(Int.MIN_VALUE), `is`(false))
    }
}
