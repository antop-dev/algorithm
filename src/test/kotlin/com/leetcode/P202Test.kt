package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P202Test {
    val p = P202()

    @Test
    fun `example 01`() {
        assertThat(p.isHappy(19), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.isHappy(2), `is`(false))
    }

}
