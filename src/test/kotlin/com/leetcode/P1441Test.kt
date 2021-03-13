package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

// https://github.com/antop-dev/algorithm/issues/166
class P1441Test {
    val p = P1441()

    @Test
    fun `example 01`() {
        assertThat(p.buildArray(intArrayOf(1, 3), 3), `is`(listOf("Push", "Push", "Pop", "Push")))
    }

    @Test
    fun `example 02`() {
        assertThat(p.buildArray(intArrayOf(1, 2, 3), 3), `is`(listOf("Push", "Push", "Push")))
    }

    @Test
    fun `example 03`() {
        assertThat(p.buildArray(intArrayOf(1, 2), 4), `is`(listOf("Push", "Push")))
    }

    @Test
    fun `example 04`() {
        assertThat(p.buildArray(intArrayOf(2, 3, 4), 4), `is`(listOf("Push", "Pop", "Push", "Push", "Push")))
    }

}
