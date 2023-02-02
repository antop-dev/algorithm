package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P37Test {
    val sut = P37()

    @Test
    fun `example 1`() {
        // given
        val board = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        // when
        sut.solveSudoku(board)
        // then
        assertThat(
            board,
            `is`(
                arrayOf(
                    charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                    charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                    charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                    charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                    charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                    charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                    charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                    charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                    charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        // given
        val board = arrayOf(
            charArrayOf('.', '.', '9', '7', '4', '8', '.', '.', '.'),
            charArrayOf('7', '.', '.', '.', '.', '.', '.', '.', '.'),
            charArrayOf('.', '2', '.', '1', '.', '9', '.', '.', '.'),
            charArrayOf('.', '.', '7', '.', '.', '.', '2', '4', '.'),
            charArrayOf('.', '6', '4', '.', '1', '.', '5', '9', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '3', '.', '.'),
            charArrayOf('.', '.', '.', '8', '.', '3', '.', '2', '.'),
            charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '6'),
            charArrayOf('.', '.', '.', '2', '7', '5', '9', '.', '.')
        )
        // when
        sut.solveSudoku(board)
        // then
        assertThat(
            board,
            `is`(
                arrayOf(
                    charArrayOf('5', '1', '9', '7', '4', '8', '6', '3', '2'),
                    charArrayOf('7', '8', '3', '6', '5', '2', '4', '1', '9'),
                    charArrayOf('4', '2', '6', '1', '3', '9', '8', '7', '5'),
                    charArrayOf('3', '5', '7', '9', '8', '6', '2', '4', '1'),
                    charArrayOf('2', '6', '4', '3', '1', '7', '5', '9', '8'),
                    charArrayOf('1', '9', '8', '5', '2', '4', '3', '6', '7'),
                    charArrayOf('9', '7', '5', '8', '6', '3', '1', '2', '4'),
                    charArrayOf('8', '3', '2', '4', '9', '1', '7', '5', '6'),
                    charArrayOf('6', '4', '1', '2', '7', '5', '9', '8', '3')
                )
            )
        )
    }

}
