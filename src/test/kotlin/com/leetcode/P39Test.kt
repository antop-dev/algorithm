package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P39Test {
    val p = P39()

    @Test
    fun `example 01`() {
        assertThat(
            p.combinationSum(intArrayOf(2, 3, 6, 7), 7),
            `is`(
                listOf(
                    listOf(2, 2, 3),
                    listOf(7)
                )
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.combinationSum(intArrayOf(2, 3, 5), 8),
            `is`(
                listOf(
                    listOf(2, 2, 2, 2),
                    listOf(2, 3, 3),
                    listOf(3, 5)
                )
            )
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.combinationSum(intArrayOf(2), 1),
            `is`(listOf())
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.combinationSum(intArrayOf(1), 1),
            `is`(listOf(listOf(1)))
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.combinationSum(intArrayOf(1), 2),
            `is`(listOf(listOf(1, 1)))
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            p.combinationSum(intArrayOf(1,2,3), 6),
            `is`(
                listOf(
                    listOf(1, 1, 1, 1, 1, 1),
                    listOf(1, 1, 1, 1, 2),
                    listOf(1, 1, 1, 3),
                    listOf(1, 1, 2, 2),
                    listOf(1, 2, 3),
                    listOf(2, 2, 2),
                    listOf(3, 3)
                )
            )
        )
    }

}

