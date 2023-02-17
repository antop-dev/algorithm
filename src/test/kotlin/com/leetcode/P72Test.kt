package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P72Test {
    val sut = P72()

    @Test
    fun `example 1`() {
        assertThat(sut.minDistance("horse", "ros"), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minDistance("intention", "execution"), `is`(5))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.minDistance("antop", "potna"), `is`(4))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.minDistance("antop", "ntopa"), `is`(2))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.minDistance("", "antop"), `is`(5))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.minDistance("antop", ""), `is`(5))
    }

}
