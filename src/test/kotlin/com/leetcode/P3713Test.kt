package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3713Test {
    val sut = P3713()

    @Test
    fun `example 1`() {
        assertThat(sut.findTheLongestBalancedSubstring("abbac"), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.findTheLongestBalancedSubstring("zzabccy"), `is`(4))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.findTheLongestBalancedSubstring("aba"), `is`(2))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.findTheLongestBalancedSubstring("xxxxxxxxxxabcdefxxxxxxxxxx"), `is`(10))
    }
}
