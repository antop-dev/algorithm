package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P171Test {
    val p = P171()

    @Test
    fun `example 01`() {
        assertThat(p.titleToNumber("A"), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.titleToNumber("AB"), `is`(28))
    }

    @Test
    fun `example 03`() {
        assertThat(p.titleToNumber("ZY"), `is`(701))
    }

    @Test
    fun `example 04`() {
        assertThat(p.titleToNumber("FXSHRXW"), `is`(2147483647))
    }

}
