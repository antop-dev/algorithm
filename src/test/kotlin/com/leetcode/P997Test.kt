package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P997Test {
    val p = P997()

    @Test
    fun `example 1`() {
        assertEquals(2,
                p.findJudge(2, arrayOf(intArrayOf(1, 2)))
        )
    }

    @Test
    fun `example 2`() {
        assertEquals(3,
                p.findJudge(3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 3)))
        )
    }

    @Test
    fun `example 3`() {
        assertEquals(-1,
                p.findJudge(3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(3, 1)))
        )
    }

    @Test
    fun `example 4`() {
        assertEquals(-1,
                p.findJudge(3, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)))
        )
    }

    @Test
    fun `example 5`() {
        assertEquals(3,
                p.findJudge(4,
                        arrayOf(intArrayOf(1, 3),
                                intArrayOf(1, 4),
                                intArrayOf(2, 3),
                                intArrayOf(2, 4),
                                intArrayOf(4, 3))
                )
        )
    }
}