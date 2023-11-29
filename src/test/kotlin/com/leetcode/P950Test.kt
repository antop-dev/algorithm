package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P950Test {
    val sut = P950()

    @Test
    fun `example 1`() {
        assertThat(
            sut.deckRevealedIncreasing(intArrayOf(17, 13, 11, 2, 3, 5, 7)),
            `is`(intArrayOf(2, 13, 3, 11, 5, 17, 7))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.deckRevealedIncreasing(intArrayOf(1, 1000)),
            `is`(intArrayOf(1, 1000))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.deckRevealedIncreasing(intArrayOf(1, 2, 3, 4, 5, 6)),
            `is`(intArrayOf(1, 4, 2, 6, 3, 5))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.deckRevealedIncreasing(intArrayOf(1, 2, 3, 4, 5, 6, 7)),
            `is`(intArrayOf(1, 6, 2, 5, 3, 7, 4))
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.deckRevealedIncreasing(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)),
            `is`(intArrayOf(1, 5, 2, 7, 3, 6, 4, 8))
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.deckRevealedIncreasing(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)),
            `is`(intArrayOf(1, 9, 2, 6, 3, 8, 4, 7, 5))
        )
    }

}
