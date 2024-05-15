package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P306Test {
    val sut = P306()

    @Test
    fun `example 1`() {
        assertThat(sut.isAdditiveNumber("112358"), `is`(true))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.isAdditiveNumber("199100199"), `is`(true))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.isAdditiveNumber("011"), `is`(true)) // 0 + 1 = 1
    }

    @Test
    fun `example 4`() {
        assertThat(sut.isAdditiveNumber("01111"), `is`(true)) // 0 + 11 = 11
    }

    @Test
    fun `example 5`() {
        assertThat(sut.isAdditiveNumber("000"), `is`(true)) // 0 + 0 = 0
    }

    @Test
    fun `example 6`() {
        assertThat(sut.isAdditiveNumber("0000"), `is`(true))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.isAdditiveNumber("0003"), `is`(false))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.isAdditiveNumber("321"), `is`(false))
    }

}
