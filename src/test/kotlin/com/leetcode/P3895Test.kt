package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3895Test {
    private val sut = P3895()

    // 문제 예제 1
    @Test
    fun `example 01`() {
        val nums = intArrayOf(12, 54, 32, 22)
        assertThat(sut.countDigitOccurrences(nums, 2), `is`(4))
    }

    // 문제 예제 2
    @Test
    fun `example 02`() {
        val nums = intArrayOf(1, 34, 7)
        assertThat(sut.countDigitOccurrences(nums, 9), `is`(0))
    }

    // 원소 1개, 값이 최소
    @Test
    fun `example 03`() {
        val nums = intArrayOf(1)
        assertThat(sut.countDigitOccurrences(nums, 1), `is`(1))
    }

    // 원소 1개, 값이 최소이고 숫자 불일치
    @Test
    fun `example 04`() {
        val nums = intArrayOf(1)
        assertThat(sut.countDigitOccurrences(nums, 0), `is`(0))
    }

    // 원소 1개, 값이 최대이고 숫자 0
    @Test
    fun `example 05`() {
        val nums = intArrayOf(1_000_000)
        assertThat(sut.countDigitOccurrences(nums, 0), `is`(6))
    }

    // 원소 1개, 값이 최대이고 숫자 1
    @Test
    fun `example 06`() {
        val nums = intArrayOf(1_000_000)
        assertThat(sut.countDigitOccurrences(nums, 1), `is`(1))
    }

    // 숫자 0이 중간에 등장
    @Test
    fun `example 07`() {
        val nums = intArrayOf(10, 100, 101, 1001)
        assertThat(sut.countDigitOccurrences(nums, 0), `is`(6))
    }

    // 숫자 0이 등장하지 않음
    @Test
    fun `example 08`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertThat(sut.countDigitOccurrences(nums, 0), `is`(0))
    }

    // 숫자 9가 반복 등장
    @Test
    fun `example 09`() {
        val nums = intArrayOf(999_999, 9, 99)
        assertThat(sut.countDigitOccurrences(nums, 9), `is`(9))
    }

    // 한 자리 수만 존재
    @Test
    fun `example 10`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertThat(sut.countDigitOccurrences(nums, 5), `is`(1))
    }

    // 모든 원소가 같은 숫자로만 구성
    @Test
    fun `example 11`() {
        val nums = intArrayOf(7, 77, 777, 7777)
        assertThat(sut.countDigitOccurrences(nums, 7), `is`(10))
    }

    // 일부만 해당 숫자 포함
    @Test
    fun `example 12`() {
        val nums = intArrayOf(123, 456, 789, 321)
        assertThat(sut.countDigitOccurrences(nums, 3), `is`(2))
    }

    // 같은 값이 반복
    @Test
    fun `example 13`() {
        val nums = intArrayOf(11, 11, 11)
        assertThat(sut.countDigitOccurrences(nums, 1), `is`(6))
    }

    // 모든 자리가 서로 다른 수
    @Test
    fun `example 14`() {
        val nums = intArrayOf(1_234_567, 987_654)
        assertThat(sut.countDigitOccurrences(nums, 4), `is`(2))
    }

    // 숫자 8 미등장
    @Test
    fun `example 15`() {
        val nums = intArrayOf(123, 4567, 90)
        assertThat(sut.countDigitOccurrences(nums, 8), `is`(0))
    }

    // 두 자리 수 경계값
    @Test
    fun `example 16`() {
        val nums = intArrayOf(10, 99, 11, 90)
        assertThat(sut.countDigitOccurrences(nums, 9), `is`(3))
    }

    // 자릿수 경계값
    @Test
    fun `example 17`() {
        val nums = intArrayOf(9, 10, 99, 100, 999, 1000)
        assertThat(sut.countDigitOccurrences(nums, 0), `is`(6))
    }

    // 숫자 6이 각 원소에 한 번씩
    @Test
    fun `example 18`() {
        val nums = intArrayOf(6, 16, 26, 36, 46, 56)
        assertThat(sut.countDigitOccurrences(nums, 6), `is`(6))
    }

    // 숫자 2 다수 등장
    @Test
    fun `example 19`() {
        val nums = intArrayOf(222_222, 202_020)
        assertThat(sut.countDigitOccurrences(nums, 2), `is`(9))
    }

    // 큰 값들 혼합
    @Test
    fun `example 20`() {
        val nums = intArrayOf(1_000_000, 999_999, 500_000, 123_456)
        assertThat(sut.countDigitOccurrences(nums, 5), `is`(2))
    }

    // 1부터 100까지 숫자 1
    @Test
    fun `example 21`() {
        val nums = IntArray(100) { it + 1 }
        assertThat(sut.countDigitOccurrences(nums, 1), `is`(21))
    }

    // 1부터 100까지 숫자 0
    @Test
    fun `example 22`() {
        val nums = IntArray(100) { it + 1 }
        assertThat(sut.countDigitOccurrences(nums, 0), `is`(11))
    }

    // 1부터 100까지 숫자 9
    @Test
    fun `example 23`() {
        val nums = IntArray(100) { it + 1 }
        assertThat(sut.countDigitOccurrences(nums, 9), `is`(20))
    }

    // 원소 최대(1000개), 모두 최소값, 숫자 1
    @Test
    fun `example 24`() {
        val nums = IntArray(1000) { 1 }
        assertThat(sut.countDigitOccurrences(nums, 1), `is`(1000))
    }

    // 원소 최대(1000개), 모두 최소값, 숫자 불일치
    @Test
    fun `example 25`() {
        val nums = IntArray(1000) { 1 }
        assertThat(sut.countDigitOccurrences(nums, 2), `is`(0))
    }

    // 원소 최대(1000개), 모두 최대값, 숫자 0
    @Test
    fun `example 26`() {
        val nums = IntArray(1000) { 1_000_000 }
        assertThat(sut.countDigitOccurrences(nums, 0), `is`(6000))
    }

    // 원소 최대(1000개), 모두 999999, 숫자 9
    @Test
    fun `example 27`() {
        val nums = IntArray(1000) { 999_999 }
        assertThat(sut.countDigitOccurrences(nums, 9), `is`(6000))
    }

    // 원소 최대(1000개), 1부터 1000까지 숫자 0
    @Test
    fun `example 28`() {
        val nums = IntArray(1000) { it + 1 }
        assertThat(sut.countDigitOccurrences(nums, 0), `is`(192))
    }

    // 원소 최대(1000개), 1부터 1000까지 숫자 7
    @Test
    fun `example 29`() {
        val nums = IntArray(1000) { it + 1 }
        assertThat(sut.countDigitOccurrences(nums, 7), `is`(300))
    }

    // 원소 최대(1000개), 1부터 1000까지 숫자 1
    @Test
    fun `example 30`() {
        val nums = IntArray(1000) { it + 1 }
        assertThat(sut.countDigitOccurrences(nums, 1), `is`(301))
    }
}
