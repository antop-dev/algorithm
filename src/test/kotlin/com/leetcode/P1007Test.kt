package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1007Test {
    val sut = P1007()

    @Test
    fun `example 1`() {
        val rotations = sut.minDominoRotations(
            tops = intArrayOf(2, 1, 2, 4, 2, 2),
            bottoms = intArrayOf(5, 2, 6, 2, 3, 2)
        )
        assertThat(rotations, `is`(2))
    }

    @Test
    fun `example 2`() {
        val rotations = sut.minDominoRotations(
            tops = intArrayOf(3, 5, 1, 2, 3),
            bottoms = intArrayOf(3, 6, 3, 3, 4)
        )
        assertThat(rotations, `is`(-1))
    }

    @Test
    fun `example 3`() {
        val rotations = sut.minDominoRotations(
            tops = intArrayOf(3, 3, 3),
            bottoms = intArrayOf(3, 3, 3)
        )
        assertThat(rotations, `is`(0))
    }

}
