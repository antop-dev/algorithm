package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1817Test {
    val p = P1817()

    @Test
    fun `example 01`() {
        assertThat(
            p.findingUsersActiveMinutes(
                arrayOf(
                    intArrayOf(0, 5),
                    intArrayOf(1, 2),
                    intArrayOf(0, 2),
                    intArrayOf(0, 5),
                    intArrayOf(1, 3)
                ), 5
            ), `is`(intArrayOf(0, 2, 0, 0, 0))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.findingUsersActiveMinutes(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(2, 2),
                    intArrayOf(2, 3)
                ), 4
            ), `is`(intArrayOf(1, 1, 0, 0))
        )
    }

}
