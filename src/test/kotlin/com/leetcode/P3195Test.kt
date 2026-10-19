package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3195Test {
    private val sut = P3195()

    @Test
    fun `example 01`() {
        val grid = arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 0, 1))
        assertThat(sut.minimumArea(grid), `is`(6))
    }

    @Test
    fun `example 02`() {
        val grid = arrayOf(intArrayOf(1, 0), intArrayOf(0, 0))
        assertThat(sut.minimumArea(grid), `is`(1))
    }

    // grid가 최소 크기(1x1)인 경우
    @Test
    fun `example 03`() {
        val grid = arrayOf(intArrayOf(1))
        assertThat(sut.minimumArea(grid), `is`(1))
    }

    @Test
    fun `example 04`() {
        val grid = arrayOf(intArrayOf(0, 1))
        assertThat(sut.minimumArea(grid), `is`(1))
    }

    @Test
    fun `example 05`() {
        val grid = arrayOf(intArrayOf(1, 1))
        assertThat(sut.minimumArea(grid), `is`(2))
    }

    @Test
    fun `example 06`() {
        val grid = arrayOf(intArrayOf(1), intArrayOf(0), intArrayOf(1))
        assertThat(sut.minimumArea(grid), `is`(3))
    }

    @Test
    fun `example 07`() {
        val grid = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))
        assertThat(sut.minimumArea(grid), `is`(1))
    }

    @Test
    fun `example 08`() {
        val grid = arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 1))
        assertThat(sut.minimumArea(grid), `is`(9))
    }

    @Test
    fun `example 09`() {
        val grid = arrayOf(intArrayOf(0, 0, 1), intArrayOf(0, 0, 0), intArrayOf(1, 0, 0))
        assertThat(sut.minimumArea(grid), `is`(9))
    }

    @Test
    fun `example 10`() {
        val grid = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1))
        assertThat(sut.minimumArea(grid), `is`(6))
    }

    @Test
    fun `example 11`() {
        val grid = arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 1, 1, 0), intArrayOf(0, 1, 1, 0), intArrayOf(0, 0, 0, 0))
        assertThat(sut.minimumArea(grid), `is`(4))
    }

    @Test
    fun `example 12`() {
        val grid = arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 1))
        assertThat(sut.minimumArea(grid), `is`(9))
    }

    @Test
    fun `example 13`() {
        val grid = arrayOf(intArrayOf(0, 0, 0), intArrayOf(1, 0, 0), intArrayOf(0, 0, 0))
        assertThat(sut.minimumArea(grid), `is`(1))
    }

    @Test
    fun `example 14`() {
        val grid = arrayOf(intArrayOf(0, 0, 0, 0, 1))
        assertThat(sut.minimumArea(grid), `is`(1))
    }

    @Test
    fun `example 15`() {
        val grid = arrayOf(intArrayOf(1, 0, 0, 0, 1))
        assertThat(sut.minimumArea(grid), `is`(5))
    }

    @Test
    fun `example 16`() {
        val grid = arrayOf(intArrayOf(0), intArrayOf(1), intArrayOf(0), intArrayOf(1), intArrayOf(0))
        assertThat(sut.minimumArea(grid), `is`(3))
    }

    @Test
    fun `example 17`() {
        val grid = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1))
        assertThat(sut.minimumArea(grid), `is`(1))
    }

    @Test
    fun `example 18`() {
        val grid = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))
        assertThat(sut.minimumArea(grid), `is`(4))
    }

    @Test
    fun `example 19`() {
        val grid = arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 1, 1), intArrayOf(0, 1, 0))
        assertThat(sut.minimumArea(grid), `is`(9))
    }

    @Test
    fun `example 20`() {
        val grid = arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 1, 0), intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 0))
        assertThat(sut.minimumArea(grid), `is`(4))
    }

    @Test
    fun `example 21`() {
        val grid = arrayOf(intArrayOf(1, 0, 1, 0, 1), intArrayOf(0, 0, 0, 0, 0))
        assertThat(sut.minimumArea(grid), `is`(5))
    }

    @Test
    fun `example 22`() {
        val grid = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 1, 1))
        assertThat(sut.minimumArea(grid), `is`(2))
    }

    @Test
    fun `example 23`() {
        val grid = arrayOf(IntArray(1000) { if (it == 999) 1 else 0 })
        assertThat(sut.minimumArea(grid), `is`(1))
    }

    @Test
    fun `example 24`() {
        val grid = arrayOf(IntArray(1000) { if (it == 0 || it == 999) 1 else 0 })
        assertThat(sut.minimumArea(grid), `is`(1000))
    }

    @Test
    fun `example 25`() {
        val grid = Array(1000) { r -> intArrayOf(if (r == 0 || r == 999) 1 else 0) }
        assertThat(sut.minimumArea(grid), `is`(1000))
    }

    // grid가 최대 크기(1000x1000)이고 모두 1인 경우
    @Test
    fun `example 26`() {
        val grid = Array(1000) { IntArray(1000) { 1 } }
        assertThat(sut.minimumArea(grid), `is`(1000000))
    }

    // grid가 최대 크기(1000x1000)이고 1이 하나뿐인 경우
    @Test
    fun `example 27`() {
        val grid = Array(1000) { r -> IntArray(1000) { c -> if (r == 500 && c == 500) 1 else 0 } }
        assertThat(sut.minimumArea(grid), `is`(1))
    }

    @Test
    fun `example 28`() {
        val grid = Array(1000) { r -> IntArray(1000) { c -> if ((r == 0 && c == 0) || (r == 999 && c == 999)) 1 else 0 } }
        assertThat(sut.minimumArea(grid), `is`(1000000))
    }

    @Test
    fun `example 29`() {
        val grid = Array(1000) { r -> IntArray(1000) { c -> if ((r == 0 && c == 999) || (r == 999 && c == 0)) 1 else 0 } }
        assertThat(sut.minimumArea(grid), `is`(1000000))
    }

    @Test
    fun `example 30`() {
        val grid = Array(1000) { r -> IntArray(1000) { c -> if ((r == 100 && c == 200) || (r == 300 && c == 700)) 1 else 0 } }
        assertThat(sut.minimumArea(grid), `is`(100701))
    }
}
