package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P554Test {
    val sut = P554()

    @Test
    fun `example 1`() {
        assertThat(
            sut.leastBricks(
                listOf(
                    listOf(1, 2, 2, 1),
                    listOf(3, 1, 2),
                    listOf(1, 3, 2),
                    listOf(2, 4),
                    listOf(3, 1, 2),
                    listOf(1, 3, 1, 1),
                )
            ), `is`(2)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.leastBricks(
                listOf(
                    listOf(1),
                    listOf(1),
                    listOf(1),
                )
            ), `is`(3)
        )
    }
}
