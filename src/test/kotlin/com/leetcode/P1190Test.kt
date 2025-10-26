package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1190Test {
    val sut = P1190()

    @Test
    fun `example 1`() {
        assertThat(sut.reverseParentheses("(abcd)"), `is`("dcba"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.reverseParentheses("(u(love)i)"), `is`("iloveu"))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.reverseParentheses("(ed(et(oc))el)"), `is`("leetcode"))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.reverseParentheses("a(bcdefghijkl(mno)p)q"), `is`("apmnolkjihgfedcbq"))
    }
}