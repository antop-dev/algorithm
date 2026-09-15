package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P835Test {
    private val sut = P835()

    @Test
    fun `example 01`() {
        val img1 = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 1, 0),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 0, 1),
        )
        val actual = sut.largestOverlap(img1, img2)
        val expected = 3
        assertThat(actual, `is`(expected))
    }

    // 가장 작은 경우 (n = 1)
    @Test
    fun `example 02`() {
        val img1 = arrayOf(intArrayOf(1))
        val img2 = arrayOf(intArrayOf(1))
        assertThat(sut.largestOverlap(img1, img2), `is`(1))
    }

    // 1이 하나도 없는 경우
    @Test
    fun `example 03`() {
        val img1 = arrayOf(intArrayOf(0))
        val img2 = arrayOf(intArrayOf(0))
        assertThat(sut.largestOverlap(img1, img2), `is`(0))
    }

    @Test
    fun `example 04`() {
        val img1 = arrayOf(intArrayOf(0))
        val img2 = arrayOf(intArrayOf(1))
        assertThat(sut.largestOverlap(img1, img2), `is`(0))
    }

    @Test
    fun `example 05`() {
        val img1 = arrayOf(intArrayOf(1))
        val img2 = arrayOf(intArrayOf(0))
        assertThat(sut.largestOverlap(img1, img2), `is`(0))
    }

    @Test
    fun `example 06`() {
        val img1 = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(0))
    }

    @Test
    fun `example 07`() {
        val img1 = arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))
        val img2 = arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))
        assertThat(sut.largestOverlap(img1, img2), `is`(4))
    }

    @Test
    fun `example 08`() {
        val img1 = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
        )
        val img2 = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(3))
    }

    @Test
    fun `example 09`() {
        val img1 = arrayOf(intArrayOf(1, 0), intArrayOf(0, 0))
        val img2 = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1))
        assertThat(sut.largestOverlap(img1, img2), `is`(1))
    }

    @Test
    fun `example 10`() {
        val img1 = arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))
        val img2 = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1))
        assertThat(sut.largestOverlap(img1, img2), `is`(1))
    }

    @Test
    fun `example 11`() {
        val img1 = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 1),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(1))
    }

    @Test
    fun `example 12`() {
        val img1 = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 1),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 0, 0),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(1))
    }

    @Test
    fun `example 13`() {
        val img1 = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 0, 0),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 1, 1),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(4))
    }

    @Test
    fun `example 14`() {
        val img1 = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(1, 1, 1),
            intArrayOf(0, 1, 0),
        )
        val img2 = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(2))
    }

    @Test
    fun `example 15`() {
        val img1 = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1),
        )
        val img2 = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(4))
    }

    @Test
    fun `example 16`() {
        val img1 = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 1),
        )
        val img2 = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(1))
    }

    @Test
    fun `example 17`() {
        val img1 = arrayOf(intArrayOf(1, 0), intArrayOf(1, 0))
        val img2 = arrayOf(intArrayOf(0, 1), intArrayOf(0, 1))
        assertThat(sut.largestOverlap(img1, img2), `is`(2))
    }

    @Test
    fun `example 18`() {
        val img1 = arrayOf(
            intArrayOf(1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(1, 1, 1, 1),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(4))
    }

    @Test
    fun `example 19`() {
        val img1 = arrayOf(
            intArrayOf(1, 0, 0, 0),
            intArrayOf(0, 1, 0, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 0, 1),
        )
        val img2 = arrayOf(
            intArrayOf(0, 1, 0, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 0, 1),
            intArrayOf(0, 0, 0, 0),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(3))
    }

    @Test
    fun `example 20`() {
        val img1 = arrayOf(
            intArrayOf(0, 0, 0, 1),
            intArrayOf(1, 1, 1, 0),
            intArrayOf(1, 1, 0, 0),
            intArrayOf(0, 0, 1, 1),
        )
        val img2 = arrayOf(
            intArrayOf(0, 1, 1, 1),
            intArrayOf(0, 1, 0, 1),
            intArrayOf(1, 0, 1, 0),
            intArrayOf(0, 1, 1, 1),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(5))
    }

    @Test
    fun `example 21`() {
        val img1 = arrayOf(
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(1, 0, 1, 1, 0),
            intArrayOf(1, 0, 0, 1, 0),
            intArrayOf(0, 0, 1, 1, 0),
            intArrayOf(1, 0, 1, 1, 0),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 0, 0, 1),
            intArrayOf(1, 0, 0, 0, 0),
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(1, 0, 1, 1, 0),
            intArrayOf(1, 0, 0, 0, 0),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(7))
    }

    @Test
    fun `example 22`() {
        val img1 = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(1, 0, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 1),
            intArrayOf(0, 1, 1, 1, 1),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 1),
            intArrayOf(1, 0, 0, 1, 0),
            intArrayOf(1, 0, 1, 1, 0),
            intArrayOf(1, 0, 1, 1, 1),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(5))
    }

    @Test
    fun `example 23`() {
        val img1 = arrayOf(
            intArrayOf(1, 0, 0, 0, 1, 1),
            intArrayOf(0, 1, 0, 0, 1, 0),
            intArrayOf(0, 1, 1, 1, 1, 1),
            intArrayOf(0, 1, 1, 1, 0, 1),
            intArrayOf(0, 1, 0, 0, 1, 1),
            intArrayOf(1, 1, 1, 1, 0, 1),
        )
        val img2 = arrayOf(
            intArrayOf(1, 0, 1, 1, 1, 0),
            intArrayOf(1, 1, 0, 1, 0, 0),
            intArrayOf(0, 1, 1, 1, 0, 1),
            intArrayOf(0, 1, 1, 0, 1, 0),
            intArrayOf(0, 0, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 1, 1, 1),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(14))
    }

    @Test
    fun `example 24`() {
        val img1 = arrayOf(
            intArrayOf(0, 1, 1, 0, 1, 1, 1),
            intArrayOf(0, 0, 0, 1, 0, 0, 1),
            intArrayOf(0, 1, 1, 0, 0, 1, 0),
            intArrayOf(1, 0, 1, 0, 0, 1, 0),
            intArrayOf(0, 1, 1, 1, 1, 0, 1),
            intArrayOf(1, 0, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1, 0, 0, 0),
        )
        val img2 = arrayOf(
            intArrayOf(1, 0, 1, 1, 1, 1, 0),
            intArrayOf(0, 0, 1, 1, 0, 0, 1),
            intArrayOf(1, 0, 0, 0, 0, 1, 1),
            intArrayOf(0, 1, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0, 0, 1),
            intArrayOf(0, 0, 1, 0, 0, 1, 1),
            intArrayOf(1, 0, 0, 1, 0, 0, 0),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(9))
    }

    @Test
    fun `example 25`() {
        val img1 = arrayOf(
            intArrayOf(1, 0, 1, 0, 0, 1, 1, 0),
            intArrayOf(1, 0, 0, 1, 1, 0, 1, 1),
            intArrayOf(0, 1, 1, 0, 0, 1, 1, 0),
            intArrayOf(0, 1, 1, 0, 1, 0, 0, 1),
            intArrayOf(0, 0, 1, 0, 1, 1, 1, 0),
            intArrayOf(0, 1, 1, 1, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 1, 1, 1, 0, 0),
            intArrayOf(0, 0, 0, 1, 1, 1, 1, 1),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 0, 0, 1, 1, 1, 0),
            intArrayOf(0, 1, 0, 1, 0, 1, 0, 0),
            intArrayOf(1, 1, 0, 0, 1, 0, 0, 1),
            intArrayOf(0, 0, 1, 1, 1, 0, 0, 1),
            intArrayOf(1, 0, 0, 1, 0, 0, 0, 0),
            intArrayOf(1, 0, 0, 1, 0, 0, 0, 1),
            intArrayOf(1, 0, 0, 1, 1, 0, 0, 1),
            intArrayOf(0, 0, 0, 1, 0, 1, 1, 0),
        )
        assertThat(sut.largestOverlap(img1, img2), `is`(16))
    }

    // 가장 큰 경우 (n = 30) 이면서 모두 1인 경우
    @Test
    fun `example 26`() {
        val img1 = Array(30) { IntArray(30) { 1 } }
        val img2 = Array(30) { IntArray(30) { 1 } }
        assertThat(sut.largestOverlap(img1, img2), `is`(900))
    }

    // 가장 큰 경우 (n = 30) 이면서 한쪽이 모두 0인 경우
    @Test
    fun `example 27`() {
        val img1 = Array(30) { IntArray(30) { 0 } }
        val img2 = Array(30) { IntArray(30) { 1 } }
        assertThat(sut.largestOverlap(img1, img2), `is`(0))
    }

    @Test
    fun `example 28`() {
        val img1 = Array(30) { r -> IntArray(30) { c -> if (r == c) 1 else 0 } }
        val img2 = Array(30) { r -> IntArray(30) { c -> if (r == c) 1 else 0 } }
        assertThat(sut.largestOverlap(img1, img2), `is`(30))
    }

    @Test
    fun `example 29`() {
        val img1 = Array(30) { r -> IntArray(30) { c -> if (r == c) 1 else 0 } }
        val img2 = Array(30) { r -> IntArray(30) { c -> if (r == c + 1) 1 else 0 } }
        assertThat(sut.largestOverlap(img1, img2), `is`(29))
    }

    @Test
    fun `example 30`() {
        val img1 = Array(30) { r -> IntArray(30) { c -> if ((r + c) % 2 == 0) 1 else 0 } }
        val img2 = Array(30) { r -> IntArray(30) { c -> if ((r + c) % 2 == 1) 1 else 0 } }
        assertThat(sut.largestOverlap(img1, img2), `is`(435))
    }

    @Test
    fun `example 31`() {
        val img1 = arrayOf(
            intArrayOf(0, 0, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(1, 0, 0, 0, 0),
        )
        val actual = sut.largestOverlap(img1, img2)
        val expected = 1
        assertThat(actual, `is`(expected))
    }
}
