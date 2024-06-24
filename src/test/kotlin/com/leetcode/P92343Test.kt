package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P92343Test {
    val sut = P92343()

    @Test
    fun `example 1`() {
        val info = intArrayOf(0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1)
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(1, 4),
            intArrayOf(0, 8),
            intArrayOf(8, 7),
            intArrayOf(9, 10),
            intArrayOf(9, 11),
            intArrayOf(4, 3),
            intArrayOf(6, 5),
            intArrayOf(4, 6),
            intArrayOf(8, 9)
        )
        assertThat(sut.solution(info, edges), `is`(5))
    }

    @Test
    fun `example 2`() {
        val info = intArrayOf(0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0)
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
            intArrayOf(2, 5),
            intArrayOf(2, 6),
            intArrayOf(3, 7),
            intArrayOf(4, 8),
            intArrayOf(6, 9),
            intArrayOf(9, 10)
        )
        assertThat(sut.solution(info, edges), `is`(5))
    }

}
