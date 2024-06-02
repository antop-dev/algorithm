package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P1282Test {
    val sut = P1282()

    @Test
    fun `example 1`() {
        assertThat(
            sut.groupThePeople(
                intArrayOf(3, 3, 3, 3, 3, 1, 3)
            ),
            containsInAnyOrder(
                listOf(5),
                listOf(0, 1, 2),
                listOf(3, 4, 6)
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.groupThePeople(
                intArrayOf(2, 1, 3, 3, 3, 2)
            ),
            containsInAnyOrder(
                listOf(1),
                listOf(0, 5),
                listOf(2, 3, 4)
            )
        )
    }
}
