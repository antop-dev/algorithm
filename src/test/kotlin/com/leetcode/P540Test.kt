package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P540Test {
    val p = P540()

    @Test
    fun `example 01`() {
        assertThat(p.singleNonDuplicate(intArrayOf(1, 1, 2, 3, 3, 4, 4, 8, 8)), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.singleNonDuplicate(intArrayOf(3, 3, 7, 7, 10, 11, 11)), `is`(10))
    }

    @Test
    fun `example 03`() {
        assertThat(p.singleNonDuplicate(intArrayOf(1)), `is`(1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.singleNonDuplicate(intArrayOf(1, 1, 2)), `is`(2))
    }

}
