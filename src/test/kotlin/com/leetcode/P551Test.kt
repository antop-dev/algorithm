package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P551Test {
    val p = P551()

    @Test
    fun `example 01`() {
        assertThat(p.checkRecord("PPALLP"), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.checkRecord("PPALLL"), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.checkRecord("LALL"), `is`(true))
    }

}
