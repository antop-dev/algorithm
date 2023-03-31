package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P207Test {
    val p = P207()

    @Test
    fun `example 1`() {
        assertThat(p.canFinish(2, arrayOf(intArrayOf(1, 0))), `is`(true))
    }

    @Test
    fun `example 2`() {
        assertThat(p.canFinish(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))), `is`(false))
    }

    @Test
    fun `example 3`() {
        assertThat(p.canFinish(1, arrayOf()), `is`(true))
    }

    @Test
    fun `example 4`() {
        assertThat(p.canFinish(3, arrayOf()), `is`(true))
    }

    @Test
    fun `example 5`() {
        assertThat(p.canFinish(3, arrayOf(intArrayOf(0, 1))), `is`(true))
    }

    @Test
    fun `example 6`() {
        assertThat(
            p.canFinish(
                20, arrayOf(
                    intArrayOf(0, 10),
                    intArrayOf(3, 18),
                    intArrayOf(5, 5),
                    intArrayOf(6, 11),
                    intArrayOf(11, 14),
                    intArrayOf(13, 1),
                    intArrayOf(15, 1),
                    intArrayOf(17, 4)
                )
            ), `is`(false)
        )
    }

    @Test
    fun `example 7`() {
        assertThat(
            p.canFinish(
                3, arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(1, 2),
                    intArrayOf(0, 1)
                )
            ), `is`(false)
        )
    }

    @Test
    fun `example 8`() {
        assertThat(
            p.canFinish(
                4, arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(1, 2),
                    intArrayOf(3, 1),
                    intArrayOf(3, 2)
                )
            ), `is`(true)
        )
    }

    @Test
    fun `example 9`() {
        assertThat(
            p.canFinish(
                4, arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(2, 1),
                    intArrayOf(3, 2),
                    intArrayOf(0, 3)
                )
            ), `is`(false)
        )
    }

}
