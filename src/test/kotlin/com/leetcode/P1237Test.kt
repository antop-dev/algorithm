package com.leetcode

import com.leetcode.P1237.CustomFunction
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1237Test {
    val sut = P1237()

    @Test
    fun `example 1`() {
        val function1 = object : CustomFunction {
            override fun f(x: Int, y: Int) = x + y
        }
        assertThat(
            sut.findSolution(function1, 5),
            `is`(
                listOf(
                    listOf(1, 4),
                    listOf(2, 3),
                    listOf(3, 2),
                    listOf(4, 1)
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        val function2 = object : CustomFunction {
            override fun f(x: Int, y: Int) = x * y
        }
        assertThat(
            sut.findSolution(function2, 5),
            `is`(
                listOf(
                    listOf(1, 5),
                    listOf(5, 1)
                )
            )
        )
    }


}
