package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P402Test {
    val p = P402()

    @Test
    fun `example 01`() {
        assertThat(p.removeKdigits("1432219", 3), `is`("1219"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.removeKdigits("10200", 1), `is`("200"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.removeKdigits("10", 2), `is`("0"))
    }

    @Test
    fun `example 04`() {
        assertThat(p.removeKdigits("1847916", 3), `is`("1416"))
    }

    @Test
    fun `example 05`() {
        assertThat(p.removeKdigits("971121381", 3), `is`("111381"))
    }

    @Test
    fun `example 06`() {
        assertThat(p.removeKdigits("19998882222", 5), `is`("182222"))
    }

    @Test
    fun `example 07`() {
        assertThat(p.removeKdigits("9", 1), `is`("0"))
    }

    @Test
    fun `example 08`() {
        assertThat(p.removeKdigits("112", 1), `is`("11"))
    }


}
