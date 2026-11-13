package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P454Test {
    private val sut = P454()

    companion object {
        private const val MAX = 1 shl 28
        private const val MIN = -(1 shl 28)
    }

    // 문제 예제 1
    @Test
    fun `example 01`() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(-2, -1)
        val nums3 = intArrayOf(-1, 2)
        val nums4 = intArrayOf(0, 2)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(2))
    }

    // 문제 예제 2
    @Test
    fun `example 02`() {
        val nums1 = intArrayOf(0)
        val nums2 = intArrayOf(0)
        val nums3 = intArrayOf(0)
        val nums4 = intArrayOf(0)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(1))
    }

    // 최소 길이(n=1), 합이 0이 아닌 경우
    @Test
    fun `example 03`() {
        val nums1 = intArrayOf(1)
        val nums2 = intArrayOf(1)
        val nums3 = intArrayOf(1)
        val nums4 = intArrayOf(1)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(0))
    }

    // 최소 길이(n=1), 합이 0인 경우
    @Test
    fun `example 04`() {
        val nums1 = intArrayOf(5)
        val nums2 = intArrayOf(-5)
        val nums3 = intArrayOf(3)
        val nums4 = intArrayOf(-3)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(1))
    }

    // 최솟값/최댓값 경계 - 합이 0
    @Test
    fun `example 05`() {
        val nums1 = intArrayOf(MIN)
        val nums2 = intArrayOf(MAX)
        val nums3 = intArrayOf(MIN)
        val nums4 = intArrayOf(MAX)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(1))
    }

    // 최솟값만 있는 경우 - 합이 0이 될 수 없음
    @Test
    fun `example 06`() {
        val nums1 = intArrayOf(MIN)
        val nums2 = intArrayOf(MIN)
        val nums3 = intArrayOf(MIN)
        val nums4 = intArrayOf(MIN)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(0))
    }

    // 최댓값만 있는 경우 - 합이 0이 될 수 없음
    @Test
    fun `example 07`() {
        val nums1 = intArrayOf(MAX)
        val nums2 = intArrayOf(MAX)
        val nums3 = intArrayOf(MAX)
        val nums4 = intArrayOf(MAX)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(0))
    }

    // 모두 0인 n=2
    @Test
    fun `example 08`() {
        val nums1 = intArrayOf(0, 0)
        val nums2 = intArrayOf(0, 0)
        val nums3 = intArrayOf(0, 0)
        val nums4 = intArrayOf(0, 0)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(16))
    }

    // 모두 양수 - 0이 될 수 없음
    @Test
    fun `example 09`() {
        val nums1 = intArrayOf(1, 2, 3)
        val nums2 = intArrayOf(4, 5, 6)
        val nums3 = intArrayOf(7, 8, 9)
        val nums4 = intArrayOf(1, 1, 1)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(0))
    }

    // 모두 음수 - 0이 될 수 없음
    @Test
    fun `example 10`() {
        val nums1 = intArrayOf(-1, -2, -3)
        val nums2 = intArrayOf(-4, -5, -6)
        val nums3 = intArrayOf(-7, -8, -9)
        val nums4 = intArrayOf(-1, -1, -1)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(0))
    }

    // 서로 부호가 반대
    @Test
    fun `example 11`() {
        val nums1 = intArrayOf(1, 2, 3)
        val nums2 = intArrayOf(1, 2, 3)
        val nums3 = intArrayOf(-1, -2, -3)
        val nums4 = intArrayOf(-1, -2, -3)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(19))
    }

    // 중복 값이 많은 경우
    @Test
    fun `example 12`() {
        val nums1 = intArrayOf(1, 1, 1)
        val nums2 = intArrayOf(-1, -1, -1)
        val nums3 = intArrayOf(0, 0, 0)
        val nums4 = intArrayOf(0, 0, 0)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(81))
    }

    // 한 배열만 0이 아닌 값
    @Test
    fun `example 13`() {
        val nums1 = intArrayOf(0, 0)
        val nums2 = intArrayOf(0, 0)
        val nums3 = intArrayOf(0, 0)
        val nums4 = intArrayOf(1, -1)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(0))
    }

    // 최솟값과 최댓값 혼합
    @Test
    fun `example 14`() {
        val nums1 = intArrayOf(MIN, MAX)
        val nums2 = intArrayOf(MIN, MAX)
        val nums3 = intArrayOf(MIN, MAX)
        val nums4 = intArrayOf(MIN, MAX)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(6))
    }

    // 오버플로 주의 - 큰 값 합
    @Test
    fun `example 15`() {
        val nums1 = intArrayOf(MAX, MAX)
        val nums2 = intArrayOf(MAX, MIN)
        val nums3 = intArrayOf(MIN, MIN)
        val nums4 = intArrayOf(0, MAX)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(4))
    }

    // 랜덤 n=3
    @Test
    fun `example 16`() {
        val nums1 = intArrayOf(4, 3, 5)
        val nums2 = intArrayOf(4, 0, -1)
        val nums3 = intArrayOf(1, 3, -2)
        val nums4 = intArrayOf(5, 0, -1)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(3))
    }

    // 랜덤 n=4
    @Test
    fun `example 17`() {
        val nums1 = intArrayOf(0, -2, 0, 0)
        val nums2 = intArrayOf(-2, -1, -1, -1)
        val nums3 = intArrayOf(2, -1, -1, 1)
        val nums4 = intArrayOf(-1, -1, 2, -1)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(49))
    }

    // 랜덤 n=5
    @Test
    fun `example 18`() {
        val nums1 = intArrayOf(9, 3, 3, 10, -10)
        val nums2 = intArrayOf(-4, 2, 7, -1, -6)
        val nums3 = intArrayOf(-2, 9, -5, 8, -1)
        val nums4 = intArrayOf(-3, 9, 6, 7, -10)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(14))
    }

    // 랜덤 n=5
    @Test
    fun `example 19`() {
        val nums1 = intArrayOf(0, -5, -1, 9, -9)
        val nums2 = intArrayOf(-9, -4, 2, -10, 0)
        val nums3 = intArrayOf(5, -4, 10, -4, 7)
        val nums4 = intArrayOf(-10, -2, -9, -7, -5)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(21))
    }

    // 랜덤 n=6
    @Test
    fun `example 20`() {
        val nums1 = intArrayOf(-5, 8, 6, 8, -1, 5)
        val nums2 = intArrayOf(1, -7, 9, -7, 4, -10)
        val nums3 = intArrayOf(7, -9, -9, 5, -7, -2)
        val nums4 = intArrayOf(1, -6, 0, 6, 2, -8)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(50))
    }

    // 랜덤 n=8
    @Test
    fun `example 21`() {
        val nums1 = intArrayOf(1, -5, 2, 2, 2, -2, 4, 3)
        val nums2 = intArrayOf(3, -4, -1, 4, 5, -4, 4, -3)
        val nums3 = intArrayOf(5, 2, 3, 3, -3, -1, 1, 5)
        val nums4 = intArrayOf(-3, -1, 1, 0, -5, -4, 5, -4)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(253))
    }

    // 랜덤 n=10
    @Test
    fun `example 22`() {
        val nums1 = intArrayOf(3, -5, 1, 3, -1, 1, -3, -1, -4, -1)
        val nums2 = intArrayOf(4, -4, -3, 3, 5, 5, 3, -1, -2, 5)
        val nums3 = intArrayOf(3, -5, 1, 4, 0, 2, -2, 2, 5, 3)
        val nums4 = intArrayOf(-1, 3, 3, -1, -4, -4, -4, 1, -2, 0)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(659))
    }

    // 랜덤 n=10
    @Test
    fun `example 23`() {
        val nums1 = intArrayOf(1, 3, 5, -2, 0, -2, 3, 2, 2, -5)
        val nums2 = intArrayOf(-1, -4, 5, -5, 1, -5, -3, -2, -4, 3)
        val nums3 = intArrayOf(-2, 4, -4, -2, 2, -1, 3, 1, 0, -3)
        val nums4 = intArrayOf(4, -5, 0, 3, -2, 0, -2, 2, -3, 5)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(647))
    }

    // 랜덤 n=20
    @Test
    fun `example 24`() {
        val nums1 = intArrayOf(-1, -3, 8, 5, -6, 1, -4, 7, 3, -3, 7, -9, -10, -3, -1, 9, 0, 1, 6, 2)
        val nums2 = intArrayOf(-2, -4, 4, -4, 10, -6, 1, -3, 9, -3, -4, 5, 7, 10, 3, 8, -9, -2, -4, -6)
        val nums3 = intArrayOf(-10, -6, 8, 10, 7, 4, -2, -3, 1, -8, 8, -2, 5, -4, -2, 6, 0, -1, 3, -8)
        val nums4 = intArrayOf(-2, -8, 6, -1, -2, 3, -6, 6, -2, -7, 1, 3, 0, 5, 4, 7, -7, 9, -4, 7)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(5501))
    }

    // 랜덤 n=50
    @Test
    fun `example 25`() {
        val nums1 = intArrayOf(2, 1, -2, -2, -1, -3, 5, 2, -3, 1, -3, -5, 1, -4, -5, 4, -3, 0, 1, -4, 5, 4, -4, 0, 3, 5, -4, 4, -1, -4, 5, 5, 5, -1, -1, -1, 4, 1, -5, -4, 0, -2, -2, 2, 1, 2, -2, 4, -1, -1)
        val nums2 = intArrayOf(-4, 4, -1, 2, -4, 3, -5, -2, 5, -1, -1, 3, 0, 5, 1, 2, 1, -4, 4, 2, -5, 2, 5, 2, 2, -2, -5, 4, -1, -1, 5, 0, -5, 1, -1, 3, -4, 1, -3, -4, -4, 1, 1, 3, -3, -2, -5, -5, 4, 0)
        val nums3 = intArrayOf(-2, 4, -5, -4, 2, -3, -3, 3, 5, 4, -3, 0, -3, 4, 2, 4, -3, -3, -4, -1, -1, -4, 5, 3, 5, 4, -5, -2, -2, 5, 0, 4, 0, -3, -2, -3, 3, 1, 2, 0, 5, -4, 3, -1, 4, 4, -2, 4, 2, 3)
        val nums4 = intArrayOf(-2, 1, -1, -1, 2, 1, -1, -3, -2, -1, 0, -5, 1, 2, 1, -4, 5, 1, 1, -1, -5, -4, 1, 2, 3, -3, -2, -5, 5, -2, 4, 2, 0, -4, -1, 5, 1, -5, -1, 3, 2, -3, -5, 1, 2, 4, 0, 2, -1, 2)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(386030))
    }

    // 랜덤 n=100
    @Test
    fun `example 26`() {
        val nums1 = intArrayOf(-6, -6, -5, -4, 9, -3, -9, 5, -10, 4, 1, 0, -4, -1, -1, -1, 0, 10, 6, -4, -5, -5, -8, -4, -8, 6, -2, 0, -1, -10, 3, 1, 6, 0, 5, -3, -6, -2, -2, -6, 1, 9, -2, 9, 3, -2, -4, -1, -8, -4, 5, 10, -1, 4, -9, -9, -9, -9, 7, 6, 0, 10, 10, -7, 6, 10, 8, -8, -3, 2, 2, 4, -4, -6, 3, 2, -8, -10, 2, 2, -10, 8, 10, 8, -6, -1, -9, -3, 0, -6, -8, 5, -10, -7, 3, -8, -1, 8, -4, 3)
        val nums2 = intArrayOf(5, -6, 6, 1, -4, 4, 1, -7, 5, 4, 3, 5, -1, -2, -3, 1, -4, -7, 6, -9, 8, 6, 0, -6, 3, 4, -5, -7, 9, 1, 8, 6, -7, -5, 7, 0, 0, 5, 2, -1, -8, 9, 8, -7, -10, 8, -5, -2, -5, 9, -9, -4, -1, -1, -3, 6, 5, 10, -8, 9, -10, 2, -8, 2, 5, -3, 6, -9, 5, 4, 3, -1, -8, 9, -3, 0, 2, 1, 9, 4, -8, 1, 7, -7, -3, 10, 3, 4, -2, 9, 9, 6, -1, -5, -2, -8, -4, 5, 6, -9)
        val nums3 = intArrayOf(-3, -5, -2, 3, 9, -3, -4, -9, 8, -4, -2, -7, -6, 0, 7, -10, 7, 6, 10, 9, 7, 9, -7, -9, 6, -2, -10, 5, 5, -2, -2, 1, -6, 6, 6, 7, -1, 9, 0, -10, -8, -1, 10, -6, 5, 8, 7, -3, -9, -10, 0, 4, -4, -8, 6, 8, 6, -7, 3, -3, -2, 2, -1, 7, 8, -1, 4, 3, 6, 10, 6, 6, -7, -5, 7, -8, -10, -10, 9, 5, 1, -1, 2, -6, 1, -3, 4, -3, -8, -8, -10, -6, -5, 5, -6, 2, -5, 3, 1, 6)
        val nums4 = intArrayOf(7, -7, 9, -4, 5, 5, 7, -9, 9, -6, -10, -9, -6, -1, -8, 0, 3, -4, 5, -2, -3, 0, -9, 2, -3, -7, 4, -4, 9, -3, -1, 7, 1, 4, -3, 3, 3, 5, -1, -8, 9, -3, -1, -10, -7, -7, -5, 10, 10, -4, -7, 7, -4, -6, 1, -9, 5, 4, -9, -6, 10, -3, 6, -3, 10, -10, 5, -8, -3, -3, -9, -7, -3, 6, -3, -5, -1, -1, 9, -6, 3, 4, -6, 2, -9, -4, 2, -5, 7, -4, -1, 4, -5, -9, 6, -7, 1, 5, -6, 3)
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(3225388))
    }

    // 최대 길이(n=200), 모두 0 - 결과 200^4
    @Test
    fun `example 27`() {
        val nums1 = IntArray(200) { 0 }
        val nums2 = IntArray(200) { 0 }
        val nums3 = IntArray(200) { 0 }
        val nums4 = IntArray(200) { 0 }
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(1600000000))
    }

    // 최대 길이(n=200), 모두 1 - 0이 될 수 없음
    @Test
    fun `example 28`() {
        val nums1 = IntArray(200) { 1 }
        val nums2 = IntArray(200) { 1 }
        val nums3 = IntArray(200) { 1 }
        val nums4 = IntArray(200) { 1 }
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(0))
    }

    // 최대 길이(n=200), 1과 -1 교차
    @Test
    fun `example 29`() {
        val nums1 = IntArray(200) { if (it % 2 == 0) 1 else -1 }
        val nums2 = IntArray(200) { if (it % 2 == 0) 1 else -1 }
        val nums3 = IntArray(200) { if (it % 2 == 0) 1 else -1 }
        val nums4 = IntArray(200) { if (it % 2 == 0) 1 else -1 }
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(600000000))
    }

    // 최대 길이(n=200), 0..199 와 음수
    @Test
    fun `example 30`() {
        val nums1 = IntArray(200) { it }
        val nums2 = IntArray(200) { it }
        val nums3 = IntArray(200) { -it }
        val nums4 = IntArray(200) { -it }
        assertThat(sut.fourSumCount(nums1, nums2, nums3, nums4), `is`(5333400))
    }
}
