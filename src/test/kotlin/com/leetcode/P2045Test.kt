package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2045Test {
    val sut = P2045()

    @Test
    fun `example 1`() {
        assertThat(sut.partitionString("abacaba"), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.partitionString("ssssss"), `is`(6))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.partitionString("hdklqkcssgxlvehva"), `is`(4))
    }
}
