package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2938Test {
    val sut = P2938()

    @Test
    fun `example 1`() {
        assertThat(sut.minimumSteps("101"), `is`(1))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minimumSteps("100"), `is`(2))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.minimumSteps("0111"), `is`(0))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.minimumSteps("1001000111"), `is`(8))
    }
    @Test
    fun `example 5`() {
        assertThat(sut.minimumSteps("0100101"), `is`(4))
    }
}