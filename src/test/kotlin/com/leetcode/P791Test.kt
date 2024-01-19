package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P791Test {
    val sut = P791()

    @Test
    fun `example 1`() {
        assertThat(sut.customSortString("cba", "abcd"), `is`("cbad"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.customSortString("cbafg", "abcd"), `is`("cbad"))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.customSortString("cba", "abcdbcd"), `is`("ccbbadd"))
    }

}
