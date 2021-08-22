package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P36Test {
    val p = P36()

    @Test
    fun `example 01`() {
        assertThat(
            p.isValidSudoku(
                arrayOf(
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
            ), `is`(true)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.isValidSudoku(
                arrayOf(
                    charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
                    charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                    charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                    charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                    charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                    charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                    charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                    charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                    charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
                )
            ), `is`(false)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.isValidSudoku(
                arrayOf(
                    charArrayOf('.', '8', '7', '6', '5', '4', '3', '2', '1'),
                    charArrayOf('2', '.', '.', '.', '.', '.', '.', '.', '.'),
                    charArrayOf('3', '.', '.', '.', '.', '.', '.', '.', '.'),
                    charArrayOf('4', '.', '.', '.', '.', '.', '.', '.', '.'),
                    charArrayOf('5', '.', '.', '.', '.', '.', '.', '.', '.'),
                    charArrayOf('6', '.', '.', '.', '.', '.', '.', '.', '.'),
                    charArrayOf('7', '.', '.', '.', '.', '.', '.', '.', '.'),
                    charArrayOf('8', '.', '.', '.', '.', '.', '.', '.', '.'),
                    charArrayOf('9', '.', '.', '.', '.', '.', '.', '.', '.')
                )
            ), `is`(true)
        )
    }


}
