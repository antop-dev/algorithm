package com.hackerrank

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class CutTheTreeTest {
    val sut = CutTheTree()

    @Test
    fun `example 1`() {
        assertThat(
            sut.cutTheTree(
                data = arrayOf(1, 2, 3, 4, 5, 6),
                edges = arrayOf(
                    arrayOf(1, 2),
                    arrayOf(1, 3),
                    arrayOf(2, 6),
                    arrayOf(3, 4),
                    arrayOf(3, 5),
                )
            ),
            `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.cutTheTree(
                data = arrayOf(100, 200, 100, 500, 100, 600),
                edges = arrayOf(
                    arrayOf(1, 2),
                    arrayOf(2, 3),
                    arrayOf(2, 5),
                    arrayOf(4, 5),
                    arrayOf(5, 6),
                )
            ),
            `is`(400)
        )
    }
}