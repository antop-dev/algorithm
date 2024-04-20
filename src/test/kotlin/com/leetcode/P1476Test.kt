package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1476Test {

    @Test
    fun `example 1`() {
        val obj = P1476(
            arrayOf(
                intArrayOf(1, 2, 1),
                intArrayOf(4, 3, 4),
                intArrayOf(3, 2, 1),
                intArrayOf(1, 1, 1)
            )
        )
        assertThat(obj.getValue(0, 2), `is`(1))
        obj.updateSubrectangle(0, 0, 3, 2, 5)
        assertThat(obj.getValue(0, 2), `is`(5))
        assertThat(obj.getValue(3, 1), `is`(5))
        obj.updateSubrectangle(3, 0, 3, 2, 10)
        assertThat(obj.getValue(3, 1), `is`(10))
        assertThat(obj.getValue(0, 2), `is`(5))
    }

    @Test
    fun `example 2`() {
        val obj = P1476(
            arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(2, 2, 2),
                intArrayOf(3, 3, 3)
            )
        )
        assertThat(obj.getValue(0, 0), `is`(1))
        obj.updateSubrectangle(0, 0, 2, 2, 100)
        assertThat(obj.getValue(0, 0), `is`(100))
        assertThat(obj.getValue(2, 2), `is`(100))
        obj.updateSubrectangle(1, 1, 2, 2, 20)
        assertThat(obj.getValue(2, 2), `is`(20))
    }

}
