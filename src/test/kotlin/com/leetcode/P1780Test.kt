package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1780Test {
    val p = P1780()

    @Test
    fun `example 01`() {
        assertThat(p.checkPowersOfThree(12), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.checkPowersOfThree(91), `is`(true))
    }

    @Test
    fun `example 03`() {
        assertThat(p.checkPowersOfThree(21), `is`(false))
    }

}
