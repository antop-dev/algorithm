package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P802Test {
    val sut = P802()

    @Test
    fun `example 01`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(5),
                    intArrayOf(0),
                    intArrayOf(5),
                    intArrayOf(),
                    intArrayOf(),
                )
            ),
            `is`(listOf(2, 4, 5, 6))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(1, 2, 3, 4),
                    intArrayOf(1, 2),
                    intArrayOf(3, 4),
                    intArrayOf(0, 4),
                    intArrayOf(),
                )
            ),
            `is`(listOf(4))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(0),
                    intArrayOf(2, 3, 4),
                    intArrayOf(3, 4),
                    intArrayOf(0, 4),
                    intArrayOf(),
                )
            ),
            `is`(listOf(4))
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(1),
                    intArrayOf(2),
                    intArrayOf(3),
                    intArrayOf(4),
                    intArrayOf(),
                )
            ),
            `is`(listOf(0, 1, 2, 3, 4))
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(1),
                    intArrayOf(0, 2, 4),
                    intArrayOf(3),
                    intArrayOf(4),
                    intArrayOf(),
                )
            ),
            `is`(listOf(2, 3, 4))
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(1),
                    intArrayOf(2),
                    intArrayOf(1),
                    intArrayOf(),
                    intArrayOf(),
                )
            ),
            `is`(listOf(3, 4))
        )
    }

    @Test
    fun `example 07`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(0),
                    intArrayOf(1),
                    intArrayOf(2),
                    intArrayOf(3),
                    intArrayOf(4),
                )
            ),
            `is`(listOf())
        )
    }

    @Test
    fun `example 08`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(),
                    intArrayOf(0),
                )
            ),
            `is`(listOf(0, 1))
        )
    }

    @Test
    fun `example 09`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(2, 4),
                    intArrayOf(3, 4),
                    intArrayOf(4),
                    intArrayOf(),
                )
            ),
            `is`(listOf(0, 1, 2, 3, 4))
        )
    }

    @Test
    fun `example 10`() {
        assertThat(
            sut.eventualSafeNodes(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(),
                    intArrayOf(),
                )
            ),
            `is`(listOf(0, 1, 2))
        )
    }

}
