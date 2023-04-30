package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P316Test {
    val sut = P316()

    @Test
    fun `example 1`() {
        assertThat(sut.removeDuplicateLetters("bcabc"), `is`("abc"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.removeDuplicateLetters("cbacdcbc"), `is`("acdb"))
    }

}
