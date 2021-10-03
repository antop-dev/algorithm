package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P81Test {
    val p = P81()

    @Test
    fun `example 01`() {
        assertThat(p.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 3), `is`(false))
    }

}
