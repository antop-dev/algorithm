package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P40Test {
    val p = P40()

    @Test
    fun `example 01`() {
        assertThat(
            p.combinationSum2(intArrayOf(10, 1, 2, 7, 6, 1, 5), 8), containsInAnyOrder(
                containsInAnyOrder(1, 1, 6),
                containsInAnyOrder(1, 2, 5),
                containsInAnyOrder(1, 7),
                containsInAnyOrder(2, 6)
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.combinationSum2(intArrayOf(2, 5, 2, 1, 2), 5), containsInAnyOrder(
                containsInAnyOrder(1, 2, 2),
                containsInAnyOrder(5)
            )
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.combinationSum2(
                IntArray(100) { 1 }, 30
            ), containsInAnyOrder(
                listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
            )
        )
    }

}
