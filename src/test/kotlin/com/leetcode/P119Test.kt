package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/pascals-triangle-ii/
internal class P119Test {
    val p = P119()

    @Test
    fun example() {
        assertThat(p.getRow(0), `is`(listOf(1)))
        assertThat(p.getRow(1), `is`(listOf(1, 1)))
        assertThat(p.getRow(2), `is`(listOf(1, 2, 1)))
        assertThat(p.getRow(3), `is`(listOf(1, 3, 3, 1)))
        assertThat(p.getRow(4), `is`(listOf(1, 4, 6, 4, 1)))
    }
}
