package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P292Test {
    val p = P292()

    @Test
    fun `example 01`() {
        assertThat(p.canWinNim(4), `is`(false))
    }

    @Test
    fun `example 02`() {
        assertThat(p.canWinNim(1), `is`(true))
    }

    @Test
    fun `example 03`() {
        assertThat(p.canWinNim(2), `is`(true))
    }


}
