package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P539Test {
    val sut = P539()

    @Test
    fun `test 1`() {
        assertThat(sut.findMinDifference(listOf("23:59", "00:00")), `is`(1))
    }

    @Test
    fun `test 2`() {
        assertThat(sut.findMinDifference(listOf("00:00", "23:59", "00:00")), `is`(0))
    }

    @Test
    fun `test 3`() {
        assertThat(sut.findMinDifference(listOf("05:31", "22:08", "00:35")), `is`(147))
    }

    @Test
    fun `test 4`() {
        assertThat(sut.findMinDifference(listOf("01:39", "10:26", "21:43")), `is`(236))
    }

}
