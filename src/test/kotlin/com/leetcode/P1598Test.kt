package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1598Test {
    val p = P1598()

    @Test
    fun `example 01`() {
        assertThat(p.minOperations(arrayOf("d1/", "d2/", "../", "d21/", "./")), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minOperations(arrayOf("d1/", "d2/", "./", "d3/", "../", "d31/")), `is`(3))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minOperations(arrayOf("d1/", "../", "../", "../")), `is`(0))
    }

    @Test
    fun `example 04`() {
        assertThat(p.minOperations(arrayOf("./", "wz4/", "../", "mj2/", "../", "../", "ik0/", "il7/")), `is`(2))
    }

}
