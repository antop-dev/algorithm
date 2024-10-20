package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P1222Test {
    val sut = P1222()

    @Test
    fun `example 1`() {
        val queens = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
            intArrayOf(4, 0),
            intArrayOf(0, 4),
            intArrayOf(3, 3),
            intArrayOf(2, 4),
        )
        val king = intArrayOf(0, 0)

        assertThat(
            sut.queensAttacktheKing(queens, king), containsInAnyOrder(
                listOf(0, 1),
                listOf(1, 0),
                listOf(3, 3),
            )
        )
    }

    @Test
    fun `example 2`() {
        val queens = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 1),
            intArrayOf(2, 2),
            intArrayOf(3, 4),
            intArrayOf(3, 5),
            intArrayOf(4, 4),
            intArrayOf(4, 5),
        )
        val king = intArrayOf(3, 3)

        assertThat(
            sut.queensAttacktheKing(queens, king), containsInAnyOrder(
                listOf(2, 2),
                listOf(3, 4),
                listOf(4, 4),
            )
        )
    }

    @Test
    fun `example 3`() {
        val queens = arrayOf(
            intArrayOf(5, 6),
            intArrayOf(7, 7),
            intArrayOf(2, 1),
            intArrayOf(0, 7),
            intArrayOf(1, 6),
            intArrayOf(5, 1),
            intArrayOf(3, 7),
            intArrayOf(0, 3),
            intArrayOf(4, 0),
            intArrayOf(1, 2),
            intArrayOf(6, 3),
            intArrayOf(5, 0),
            intArrayOf(0, 4),
            intArrayOf(2, 2),
            intArrayOf(1, 1),
            intArrayOf(6, 4),
            intArrayOf(5, 4),
            intArrayOf(0, 0),
            intArrayOf(2, 6),
            intArrayOf(4, 5),
            intArrayOf(5, 2),
            intArrayOf(1, 4),
            intArrayOf(7, 5),
            intArrayOf(2, 3),
            intArrayOf(0, 5),
            intArrayOf(4, 2),
            intArrayOf(1, 0),
            intArrayOf(2, 7),
            intArrayOf(0, 1),
            intArrayOf(4, 6),
            intArrayOf(6, 1),
            intArrayOf(0, 6),
            intArrayOf(4, 3),
            intArrayOf(1, 7),
        )
        val king = intArrayOf(3, 4)

        assertThat(
            sut.queensAttacktheKing(queens, king), containsInAnyOrder(
                listOf(2, 3),
                listOf(1, 4),
                listOf(1, 6),
                listOf(3, 7),
                listOf(4, 3),
                listOf(5, 4),
                listOf(4, 5),
            )
        )
    }
}
