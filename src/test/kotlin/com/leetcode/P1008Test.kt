package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P1008Test {
    val p = P1008()

    @Test
    fun `example 01`() {
        val root = p.bstFromPreorder(intArrayOf(8, 5, 1, 7, 10, 12))

        assertThat(root?.`val`, `is`(8))
        assertThat(root?.left?.`val`, `is`(5))
        assertThat(root?.left?.left?.`val`, `is`(1))
        assertThat(root?.left?.right?.`val`, `is`(7))
        assertThat(root?.left?.right?.right, nullValue())
        assertThat(root?.right?.`val`, `is`(10))
        assertThat(root?.right?.left, nullValue())
        assertThat(root?.right?.right?.`val`, `is`(12))
    }

    @Test
    fun `example 02`() {
        val root = p.bstFromPreorder(intArrayOf(1, 3))

        assertThat(root?.`val`, `is`(1))
        assertThat(root?.left, nullValue())
        assertThat(root?.right?.`val`, `is`(3))
    }

}
