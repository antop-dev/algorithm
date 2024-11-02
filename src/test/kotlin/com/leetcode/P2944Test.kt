package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2944Test {
    val sut = P2944()

    @Test
    fun `example 1`() {
        assertThat(sut.minimumCoins(intArrayOf(3, 1, 2)), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minimumCoins(intArrayOf(1, 10, 1, 1)), `is`(2))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.minimumCoins(intArrayOf(26, 18, 6, 12, 49, 7, 45, 45)), `is`(39))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.minimumCoins(intArrayOf(1, 100, 1, 100, 100, 100, 1)), `is`(3))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.minimumCoins(intArrayOf(1, 100, 1, 100, 100, 100, 1, 2, 3)), `is`(3))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.minimumCoins(intArrayOf(1, 100, 2, 100, 100, 100, 100, 1)), `is`(103))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.minimumCoins(intArrayOf(27, 17, 29, 45, 3, 39, 42, 26)), `is`(47))
    }

    @Test
    fun `example 8`() {
        assertThat(
            // 1, 19, 11, 6 = 37
            sut.minimumCoins(intArrayOf(1, 37, 19, 38, 11, 42, 18, 33, 6, 37, 15, 48, 23, 12, 41, 18, 27, 32)), `is`(37)
            //                         [0] [1] [2] [3] [4] [5] [6]    [8]
            //                          ↑       ↑       ↑              ↑
        )
    }
    
    @Test
    fun `example 9`() {
        assertThat(sut.minimumCoins(intArrayOf(10)), `is`(10))
    }
}
