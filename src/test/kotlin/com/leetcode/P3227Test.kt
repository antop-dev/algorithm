package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3227Test {
    private val sut = P3227()

    @Test
    fun `example 1`() {
        assertThat(sut.doesAliceWin("leetcoder"), `is`(true))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.doesAliceWin("bbcd"), `is`(false))
    }


    @Test
    fun `example 3`() {
        assertThat(sut.doesAliceWin("ifld"), `is`(true))
    }
}
