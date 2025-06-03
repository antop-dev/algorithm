package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1334Test {
    val sut = P1334()

    @Test
    fun `example 1`() {
        assertThat(
            sut.findTheCity(
                n = 4,
                edges = arrayOf(
                    intArrayOf(0, 1, 3),
                    intArrayOf(1, 2, 1),
                    intArrayOf(1, 3, 4),
                    intArrayOf(2, 3, 1),
                ),
                distanceThreshold = 4,
            ),
            `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.findTheCity(
                n = 5,
                edges = arrayOf(
                    intArrayOf(0, 1, 2),
                    intArrayOf(0, 4, 8),
                    intArrayOf(1, 2, 3),
                    intArrayOf(1, 4, 2),
                    intArrayOf(2, 3, 1),
                    intArrayOf(3, 4, 1),
                ),
                distanceThreshold = 2,
            ),
            `is`(0)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.findTheCity(
                n = 6,
                edges = arrayOf(
                    intArrayOf(0, 1, 10),
                    intArrayOf(0, 2, 1),
                    intArrayOf(2, 3, 1),
                    intArrayOf(1, 3, 1),
                    intArrayOf(1, 4, 1),
                    intArrayOf(4, 5, 10),
                ),
                distanceThreshold = 20,
            ),
            `is`(5)
        )
    }
}