package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1694Test {
    val p = P1694()

    @Test
    fun `example 01`() {
        assertThat(p.reformatNumber("1-23-45 6"), `is`("123-456"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.reformatNumber("123 4-567"), `is`("123-45-67"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.reformatNumber("123 4-5678"), `is`("123-456-78"))
    }

    @Test
    fun `example 04`() {
        assertThat(p.reformatNumber("12"), `is`("12"))
    }

    @Test
    fun `example 05`() {
        assertThat(p.reformatNumber("--17-5 229 35-39475 "), `is`("175-229-353-94-75"))
    }

}
