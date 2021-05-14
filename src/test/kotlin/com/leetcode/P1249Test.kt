package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.anyOf
import org.junit.jupiter.api.Test

class P1249Test {
    val p = P1249()

    @Test
    fun `example 01`() {
        assertThat(
            p.minRemoveToMakeValid("lee(t(c)o)de)"),
            anyOf(`is`("lee(t(c)o)de"), `is`("lee(t(co)de)"), `is`("lee(t(c)ode)"))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(p.minRemoveToMakeValid("a)b(c)d"), `is`("ab(c)d"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minRemoveToMakeValid("))(("), `is`(""))
    }

    @Test
    fun `example 04`() {
        assertThat(p.minRemoveToMakeValid("(a(b(c)d)"), `is`("a(b(c)d)"))
    }

    @Test
    fun `example 05`() {
        assertThat(p.minRemoveToMakeValid("())()((("), `is`("()()"))
    }

    @Test
    fun `example 06`() {
        assertThat(p.minRemoveToMakeValid(")))t((u)"), `is`("t(u)"))
    }

}
