package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.anyOf
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1980Test {
    val sut = P1980()

    @Test
    fun `example 1`() {
        assertThat(
            sut.findDifferentBinaryString(arrayOf("01", "10")),
            anyOf(`is`("11"), `is`("00"))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.findDifferentBinaryString(arrayOf("00", "01")),
            anyOf(`is`("11"), `is`("10"))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.findDifferentBinaryString(arrayOf("111", "011", "001")),
            anyOf(
                `is`("101"),
                `is`("000"),
                `is`("010"),
                `is`("100"),
                `is`("110"),
            )
        )
    }
}