package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3342Test {
    val sut = P3342()

    @Test
    fun `example 1`() {
        val moveTime = arrayOf(
            intArrayOf(0, 4),
            intArrayOf(4, 4),
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(7))
    }

    @Test
    fun `example 2`() {
        val moveTime = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(6))
    }

    @Test
    fun `example 3`() {
        val moveTime = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(4))
    }

    @Test
    fun `example 4`() {
        val moveTime = arrayOf(
            intArrayOf(0, 58),
            intArrayOf(27, 69),
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(71))
    }
}
