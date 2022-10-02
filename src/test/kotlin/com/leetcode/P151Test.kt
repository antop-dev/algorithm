package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P151Test {
    val sut = P151()

    @Test
    fun `example 01`() {
        assertThat(sut.reverseWords("the sky is blue"), `is`("blue is sky the"))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.reverseWords("  hello world  "), `is`("world hello"))
    }

}
