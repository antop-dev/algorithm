package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/search-a-2d-matrix/
class P74Test {
    val p = P74()

    @Test
    fun `example 1`() {
        assertThat(
            p.searchMatrix(
                arrayOf(
                    intArrayOf(1, 3, 5, 7),
                    intArrayOf(10, 11, 16, 20),
                    intArrayOf(23, 30, 34, 50)
                ),
                3
            ),
            `is`(true)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            p.searchMatrix(
                arrayOf(
                    intArrayOf(1, 3, 5, 7),
                    intArrayOf(10, 11, 16, 20),
                    intArrayOf(23, 30, 34, 50)
                ),
                13
            ),
            `is`(false)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            p.searchMatrix(
                arrayOf(intArrayOf()),
                1
            ),
            `is`(false)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            p.searchMatrix(
                arrayOf(intArrayOf(1)),
                1
            ),
            `is`(true)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            p.searchMatrix(
                arrayOf(intArrayOf(1, 1)),
                2
            ),
            `is`(false)
        )
    }
}
