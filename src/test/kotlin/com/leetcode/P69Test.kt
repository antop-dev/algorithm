package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P69Test {
    val p = P69()

    @Test
    fun `example 1`() {
        assertThat(p.mySqrt(4), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(p.mySqrt(8), `is`(2))
    }

    @Test
    fun `example 3`() {
        assertThat(p.mySqrt(1), `is`(1))
    }

    @Test
    fun `example 4`() {
        assertThat(p.mySqrt(2147395599), `is`(46339))
    }

    @Test
    fun `example 5`() {
        assertThat(p.mySqrt(3), `is`(1))
    }

    @Test
    fun `example 6`() {
        assertThat(p.mySqrt(0), `is`(0))
    }

    @Test
    fun `example 7`() {
        p.mySqrt(17)
    }

}