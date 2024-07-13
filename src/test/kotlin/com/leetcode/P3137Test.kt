package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3137Test {
    val sut = P3137()

    @Test
    fun `example 1`() {
        val operations = sut.minimumOperationsToMakeKPeriodic("leetcodeleet", 4)
        assertThat(operations, `is`(1))
    }

    @Test
    fun `example 2`() {
        val operations = sut.minimumOperationsToMakeKPeriodic("leetcoleet", 2)
        assertThat(operations, `is`(3))
    }

    @Test
    fun `example 3`() {
        val operations = sut.minimumOperationsToMakeKPeriodic("a", 1)
        assertThat(operations, `is`(0))
    }
}
