package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1828Test {
    val sut = P1828()

    @Test
    fun `example 1`() {
        val points = arrayOf(point(1, 3), point(3, 3), point(5, 3), point(2, 2))
        val queries = arrayOf(circle(2, 3, 1), circle(4, 3, 1), circle(1, 1, 2))
        assertThat(sut.countPoints(points, queries), `is`(intArrayOf(3, 2, 2)))
    }

    @Test
    fun `example 2`() {
        val points = arrayOf(point(1, 1), point(2, 2), point(3, 3), point(4, 4), point(5, 5))
        val queries = arrayOf(circle(1, 2, 2), circle(2, 2, 2), circle(4, 3, 2), circle(4, 3, 3))
        assertThat(sut.countPoints(points, queries), `is`(intArrayOf(2, 3, 2, 4)))
    }

    private fun point(x: Int, y: Int) = intArrayOf(x, y)

    private fun circle(x: Int, y: Int, r: Int) = intArrayOf(x, y, r)

}
