package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P654Test {
    val p = P654()

    @Test
    fun `example 01`() {
        val root = p.constructMaximumBinaryTree(intArrayOf(3, 2, 1, 6, 0, 5))

        assertThat(root?.`val`, `is`(6))
        assertThat(root?.left?.`val`, `is`(3))
        assertThat(root?.left?.left, nullValue())
        assertThat(root?.left?.right?.`val`, `is`(2))
        assertThat(root?.left?.right?.left, nullValue())
        assertThat(root?.left?.right?.right?.`val`, `is`(1))
        assertThat(root?.right?.`val`, `is`(5))
        assertThat(root?.right?.left?.`val`, `is`(0))
        assertThat(root?.right?.right, nullValue())
    }

    @Test
    fun `example 02`() {
        val root = p.constructMaximumBinaryTree(intArrayOf(3, 2, 1))

        assertThat(root?.`val`, `is`(3))
        assertThat(root?.left, nullValue())
        assertThat(root?.right?.`val`, `is`(2))
        assertThat(root?.right?.left, nullValue())
        assertThat(root?.right?.right?.`val`, `is`(1))
    }

    @Test
    fun `example 03`() {
        val root = p.constructMaximumBinaryTree(intArrayOf(1, 2, 3))

        assertThat(root?.`val`, `is`(3))
        assertThat(root?.left?.`val`, `is`(2))
        assertThat(root?.right, nullValue())
        assertThat(root?.left?.left?.`val`, `is`(1))
        assertThat(root?.left?.right, nullValue())
    }

}
