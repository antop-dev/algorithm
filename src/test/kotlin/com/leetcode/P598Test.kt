package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P598Test {
    val p = P598()

    @Test
    fun `example 01`() {
        assertThat(
            p.maxCount(3, 3, arrayOf(intArrayOf(2, 2), intArrayOf(3, 3))),
            `is`(4)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(p.maxCount(3, 3, arrayOf()), `is`(9))
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.maxCount(
                26, 17, arrayOf(
                    intArrayOf(20, 10),
                    intArrayOf(26, 11),
                    intArrayOf(2, 11),
                    intArrayOf(4, 16),
                    intArrayOf(2, 3),
                    intArrayOf(23, 13),
                    intArrayOf(7, 15),
                    intArrayOf(11, 11),
                    intArrayOf(25, 13),
                    intArrayOf(11, 13),
                    intArrayOf(13, 11),
                    intArrayOf(13, 16),
                    intArrayOf(26, 17)
                )
            ),
            `is`(6)
        )
    }

}
