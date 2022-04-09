package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P90Test {
    val p = P90()

    @Test
    fun `example 01`() {
        assertThat(
                p.subsetsWithDup(intArrayOf(1, 2, 2)),
                containsInAnyOrder(listOf(), listOf(1), listOf(1, 2), listOf(1, 2, 2), listOf(2), listOf(2, 2))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(p.subsetsWithDup(intArrayOf(0)), containsInAnyOrder(listOf(), listOf(0)))
    }

}
