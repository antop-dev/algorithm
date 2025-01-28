package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.anyOf
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1253Test {
    val sut = P1253()

    @Test
    fun `example 1`() {
        assertThat(
            sut.reconstructMatrix(2, 1, intArrayOf(1, 1, 1)),
            anyOf(
                `is`(
                    listOf(
                        listOf(1, 0, 1),
                        listOf(0, 1, 0)
                    )
                ),
                `is`(
                    listOf(
                        listOf(0, 1, 1),
                        listOf(1, 0, 0)
                    )
                ),
                `is`(
                    listOf(
                        listOf(1, 1, 0),
                        listOf(0, 0, 1)
                    )
                ),
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.reconstructMatrix(2, 3, intArrayOf(2, 2, 1, 1)),
            anyOf(
                `is`(listOf()),
            )
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.reconstructMatrix(5, 5, intArrayOf(2, 1, 2, 0, 1, 0, 1, 2, 0, 1)),
            anyOf(
                `is`(
                    listOf(
                        listOf(1, 1, 1, 0, 1, 0, 0, 1, 0, 0),
                        listOf(1, 0, 1, 0, 0, 0, 1, 1, 0, 1)
                    )
                ),
            )
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.reconstructMatrix(4, 7, intArrayOf(2, 1, 2, 2, 1, 1, 1)),
            anyOf(
                `is`(
                    listOf()
                ),
            )
        )
    }
}
