package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P125Test {
    val p = P125()

    @Test
    fun `example 01`() {
        assertThat(p.isPalindrome("A man, a plan, a canal: Panama"), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.isPalindrome("race a ca"), `is`(false))
    }
}
