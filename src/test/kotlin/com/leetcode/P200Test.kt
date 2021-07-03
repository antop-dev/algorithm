package com.leetcode

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P200Test {
    val p = P200()

    @Test
    fun `example 01`() {
        MatcherAssert.assertThat(
            p.numIslands(
                arrayOf(
                    charArrayOf('1', '1', '1', '1', '0'),
                    charArrayOf('1', '1', '0', '1', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '0', '0', '0')
                )
            ), `is`(1)
        )
    }

    @Test
    fun `example 02`() {
        MatcherAssert.assertThat(
            p.numIslands(
                arrayOf(
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '1', '0', '0'),
                    charArrayOf('0', '0', '0', '1', '1')
                )
            ), `is`(3)
        )
    }

    @Test
    fun `example 03`() {
        MatcherAssert.assertThat(
            p.numIslands(
                arrayOf(
                    charArrayOf('0', '1', '1', '1', '1'),
                    charArrayOf('0', '0', '1', '0', '0'),
                    charArrayOf('1', '1', '1', '1', '0'),
                    charArrayOf('0', '0', '0', '0', '1')
                )
            ), `is`(2)
        )
    }

}
