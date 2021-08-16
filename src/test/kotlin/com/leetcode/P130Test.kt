package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P130Test {
    val p = P130()

    @Test
    fun `example 01`() {
        val board = arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'X'),
            charArrayOf('X', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', 'X')
        )

        p.solve(board)

        assertThat(
            board,
            `is`(
                arrayOf(
                    charArrayOf('X', 'X', 'X', 'X'),
                    charArrayOf('X', 'X', 'X', 'X'),
                    charArrayOf('X', 'X', 'X', 'X'),
                    charArrayOf('X', 'O', 'X', 'X')
                )
            )
        )
    }

    @Test
    fun `example 02`() {
        val board = arrayOf(
            charArrayOf('X')
        )

        p.solve(board)

        assertThat(
            board,
            `is`(
                arrayOf(
                    charArrayOf('X')
                )
            )
        )
    }

    @Test
    fun `example 03`() {
        val board = arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('O', 'O', 'O', 'X'),
            charArrayOf('X', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', 'X')
        )

        p.solve(board)

        assertThat(
            board,
            `is`(
                arrayOf(
                    charArrayOf('X', 'X', 'X', 'X'),
                    charArrayOf('O', 'O', 'O', 'X'),
                    charArrayOf('X', 'X', 'O', 'X'),
                    charArrayOf('X', 'O', 'X', 'X')
                )
            )
        )
    }
}
