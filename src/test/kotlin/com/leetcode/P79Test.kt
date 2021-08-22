package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P79Test {
    val p = P79()

    @Test
    fun `example 01`() {
        assertThat(
            p.exist(
                board = arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'C', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ), word = "ABCCED"
            ), `is`(true)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.exist(
                board = arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'C', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ), word = "SEE"
            ), `is`(true)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.exist(
                board = arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'C', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ), word = "ABCB"
            ), `is`(false)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.exist(
                board = arrayOf(
                    charArrayOf('C', 'A', 'A'),
                    charArrayOf('A', 'A', 'A'),
                    charArrayOf('B', 'C', 'D')
                ), word = "AAB"
            ), `is`(true)
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.exist(
                board = arrayOf(
                    charArrayOf('a', 'b'),
                    charArrayOf('c', 'd')
                ), word = "cdba"
            ), `is`(true)
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            p.exist(
                board = arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'E', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ), word = "ABCESEEEFS"
            //             0123456789
            ), `is`(true)
        )
    }

}
