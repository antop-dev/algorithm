package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import utils.FileUtils

class P1010Test {
    val p = P1010()

    @Test
    fun `example 01`() {
        assertThat(p.numPairsDivisibleBy60(intArrayOf(30, 20, 150, 100, 40)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.numPairsDivisibleBy60(intArrayOf(60, 60, 60)), `is`(3))
    }

    @Test
    fun `example 03`() {
        val array = FileUtils.readFile("src/test/resources/com/leetcode/p1010-03.txt", IntArray::class.java)
        assertThat(p.numPairsDivisibleBy60(array), `is`(12297853))
    }

    @Test
    fun `example 04`() {
        assertThat(p.numPairsDivisibleBy60(intArrayOf(418, 204, 77, 278, 239, 457, 284, 263, 372, 279, 476, 416, 360, 18)), `is`(1))
    }

    @Test
    fun `example 05`() {
        assertThat(p.numPairsDivisibleBy60(intArrayOf(440, 204, 481, 140, 310, 354, 34, 150, 184, 360, 16, 301, 290, 178, 138, 393, 399, 260, 381, 499)), `is`(2))
    }

}
