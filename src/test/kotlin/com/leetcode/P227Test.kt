package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P227Test {
    val p = P227()

    @Test
    fun `example 01`() {
        assertThat(p.calculate("3+2*2"), `is`(7))
    }

    @Test
    fun `example 02`() {
        assertThat(p.calculate(" 3/2 "), `is`(1))
    }

    @Test
    fun `example 03`() {
        assertThat(p.calculate(" 3+5 / 2 "), `is`(5))
    }

    @Test
    fun `example 04`() {
        assertThat(p.calculate("1-1+1"), `is`(1))
    }

    @Test
    fun `example 05`() {
        assertThat(p.calculate("1+2*5/3+6/4*2"), `is`(6))
    }

    @Test
    fun `example 06`() {
        assertThat(p.calculate("1*2-3/4+5*6-7*8+9/10"), `is`(-24))
    }

    @Test
    fun `example 07`() {
        assertThat(p.calculate("1*2+3*4-5*6+7*8-9*10"), `is`(-50))
    }


}
