package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P461Test {
    val p = P461()

    @Test
    fun `example 01`() {
        assertThat(p.hammingDistance(1, 4), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.hammingDistance(3, 1), `is`(1))
    }

    @Test
    fun `example 03`() {
        assertThat(p.hammingDistance(1, 16), `is`(2))
    }

    @Test
    fun `example 04`() {
        assertThat(p.hammingDistance(4, 2), `is`(2))
    }

    @Test
    fun `example 05`() {
        assertThat(p.hammingDistance(27, 1), `is`(3))
    }

}
