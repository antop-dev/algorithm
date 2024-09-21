package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2610Test {
    val sut = P2610()

    @Test
    fun `example 1`() {
        assertThat(
            sut.findMatrix(intArrayOf(1, 3, 4, 1, 2, 3, 1)),
            containsInAnyOrder(
                containsInAnyOrder(1, 3, 4, 2),
                containsInAnyOrder(1, 3),
                containsInAnyOrder(1),
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.findMatrix(intArrayOf(1, 2, 3, 4)),
            `is`(listOf(listOf(1, 2, 3, 4)))
        )
    }
}
