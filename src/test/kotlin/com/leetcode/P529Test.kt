package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P529Test {
    val sut = P529()

    @Test
    fun `example 1`() {
        assertThat(
            sut.updateBoard(
                board = arrayOf(
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'M', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                ),
                click = intArrayOf(3, 0)
            ),
            `is`(
                arrayOf(
                    charArrayOf('B', '1', 'E', '1', 'B'),
                    charArrayOf('B', '1', 'M', '1', 'B'),
                    charArrayOf('B', '1', '1', '1', 'B'),
                    charArrayOf('B', 'B', 'B', 'B', 'B'),
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.updateBoard(
                board = arrayOf(
                    charArrayOf('B', '1', 'E', '1', 'B'),
                    charArrayOf('B', '1', 'M', '1', 'B'),
                    charArrayOf('B', '1', '1', '1', 'B'),
                    charArrayOf('B', 'B', 'B', 'B', 'B'),
                ),
                click = intArrayOf(1, 2)
            ),
            `is`(
                arrayOf(
                    charArrayOf('B', '1', 'E', '1', 'B'),
                    charArrayOf('B', '1', 'X', '1', 'B'),
                    charArrayOf('B', '1', '1', '1', 'B'),
                    charArrayOf('B', 'B', 'B', 'B', 'B'),
                )
            )
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.updateBoard(
                board = arrayOf(
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'M', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                ),
                click = intArrayOf(2, 2)
            ),
            `is`(
                arrayOf(
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'M', 'E', 'E'),
                    charArrayOf('E', 'E', '1', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                )
            )
        )
    }

    // ,[],[],[],[],[],[],[]

    @Test
    fun `example 4`() {
        assertThat(
            sut.updateBoard(
                board = arrayOf(
                    charArrayOf('E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E', 'E', 'E', 'M'),
                    charArrayOf('E', 'E', 'M', 'E', 'E', 'E', 'E', 'E'),
                    charArrayOf('M', 'E', 'E', 'E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'M', 'M', 'E', 'E', 'E', 'E'),
                ),
                click = intArrayOf(0, 0)
            ),
            `is`(
                arrayOf(
                    charArrayOf('B', 'B', 'B', 'B', 'B', 'B', '1', 'E'),
                    charArrayOf('B', '1', '1', '1', 'B', 'B', '1', 'M'),
                    charArrayOf('1', '2', 'M', '1', 'B', 'B', '1', '1'),
                    charArrayOf('M', '2', '1', '1', 'B', 'B', 'B', 'B'),
                    charArrayOf('1', '1', 'B', 'B', 'B', 'B', 'B', 'B'),
                    charArrayOf('B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'),
                    charArrayOf('B', '1', '2', '2', '1', 'B', 'B', 'B'),
                    charArrayOf('B', '1', 'M', 'M', '1', 'B', 'B', 'B'),
                )
            )
        )
    }
}