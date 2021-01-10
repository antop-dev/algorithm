package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1688Test {
    val p = P1688()

    @Test
    fun `example 01`() {
        assertThat(p.numberOfMatches(7), `is`(6))
    }

    @Test
    fun `example 02`() {
        assertThat(p.numberOfMatches(14), `is`(13))
    }

}
