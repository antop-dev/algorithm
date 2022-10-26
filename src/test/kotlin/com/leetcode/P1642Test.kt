package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1642Test {
    val sut = P1642()

    @Test
    fun `example 01`() {
        assertThat(sut.furthestBuilding(intArrayOf(4, 2, 7, 6, 9, 14, 12), 5, 1), `is`(4))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.furthestBuilding(intArrayOf(4, 12, 2, 7, 3, 18, 20, 3, 19), 10, 2), `is`(7))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.furthestBuilding(intArrayOf(14, 3, 19, 3), 17, 0), `is`(3))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.furthestBuilding(intArrayOf(1, 5, 1, 2, 3, 4, 10000), 4, 1), `is`(5))
    }

}
