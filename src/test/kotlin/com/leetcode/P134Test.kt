package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P134Test {
    val p = P134()

    @Test
    fun `example 01`() {
        assertThat(
            p.canCompleteCircuit(gas = intArrayOf(1, 2, 3, 4, 5), cost = intArrayOf(3, 4, 5, 1, 2)),
            `is`(3)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.canCompleteCircuit(gas = intArrayOf(2, 3, 4), cost = intArrayOf(3, 4, 3)),
            `is`(-1)
        )
    }

}
