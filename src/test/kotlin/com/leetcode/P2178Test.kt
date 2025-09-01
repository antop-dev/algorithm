package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.anyOf
import org.hamcrest.Matchers.containsInAnyOrder
import org.hamcrest.Matchers.empty
import org.junit.jupiter.api.Test

class P2178Test {
    val sut = P2178()

    @Test
    fun `example 1`() {
        assertThat(sut.maximumEvenSplit(12), containsInAnyOrder(2, 4, 6))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.maximumEvenSplit(7), empty())
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.maximumEvenSplit(28),
            anyOf(
                containsInAnyOrder(6, 8, 2, 12),
                containsInAnyOrder(2, 4, 6, 16)
            )

        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.maximumEvenSplit(6),
            anyOf(
                containsInAnyOrder(2, 4),
            )
        )
    }
}