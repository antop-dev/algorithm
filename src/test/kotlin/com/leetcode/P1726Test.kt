package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1726Test {
    private val sut = P1726()

    // 문제 예제 1
    @Test
    fun `example 01`() {
        val nums = intArrayOf(2, 3, 4, 6)
        assertThat(sut.tupleSameProduct(nums), `is`(8))
    }

    // 문제 예제 2
    @Test
    fun `example 02`() {
        val nums = intArrayOf(1, 2, 4, 5, 10)
        assertThat(sut.tupleSameProduct(nums), `is`(16))
    }

    // 원소 1개 (최소 길이)
    @Test
    fun `example 03`() {
        val nums = intArrayOf(1)
        assertThat(sut.tupleSameProduct(nums), `is`(0))
    }

    // 원소 2개
    @Test
    fun `example 04`() {
        val nums = intArrayOf(1, 2)
        assertThat(sut.tupleSameProduct(nums), `is`(0))
    }

    // 원소 3개
    @Test
    fun `example 05`() {
        val nums = intArrayOf(1, 2, 3)
        assertThat(sut.tupleSameProduct(nums), `is`(0))
    }

    // 원소 4개, 같은 곱 없음
    @Test
    fun `example 06`() {
        val nums = intArrayOf(1, 2, 3, 5)
        assertThat(sut.tupleSameProduct(nums), `is`(0))
    }

    // 원소 4개, 같은 곱 한 쌍
    @Test
    fun `example 07`() {
        val nums = intArrayOf(1, 2, 3, 6)
        assertThat(sut.tupleSameProduct(nums), `is`(8))
    }

    // 같은 곱을 갖는 쌍이 3개
    @Test
    fun `example 08`() {
        val nums = intArrayOf(1, 2, 3, 4, 6, 12)
        assertThat(sut.tupleSameProduct(nums), `is`(40))
    }

    // 2의 거듭제곱
    @Test
    fun `example 09`() {
        val nums = intArrayOf(1, 2, 4, 8, 16)
        assertThat(sut.tupleSameProduct(nums), `is`(24))
    }

    // 소수만 존재
    @Test
    fun `example 10`() {
        val nums = intArrayOf(2, 3, 5, 7, 11, 13)
        assertThat(sut.tupleSameProduct(nums), `is`(0))
    }

    // 같은 곱 여러 그룹
    @Test
    fun `example 11`() {
        val nums = intArrayOf(2, 3, 4, 6, 8, 12)
        assertThat(sut.tupleSameProduct(nums), `is`(40))
    }

    // 곱 24를 만드는 쌍 다수
    @Test
    fun `example 12`() {
        val nums = intArrayOf(1, 2, 3, 4, 6, 8, 12, 24)
        assertThat(sut.tupleSameProduct(nums), `is`(128))
    }

    // 큰 값으로 구성된 같은 곱
    @Test
    fun `example 13`() {
        val nums = intArrayOf(100, 200, 50, 400)
        assertThat(sut.tupleSameProduct(nums), `is`(8))
    }

    // 최대값 포함 같은 곱
    @Test
    fun `example 14`() {
        val nums = intArrayOf(1, 10_000, 100, 10, 1000)
        assertThat(sut.tupleSameProduct(nums), `is`(24))
    }

    // 최대값 근처 같은 곱 없음
    @Test
    fun `example 15`() {
        val nums = intArrayOf(9997, 9998, 9999, 10_000)
        assertThat(sut.tupleSameProduct(nums), `is`(0))
    }

    // 곱이 겹치지 않는 홀수
    @Test
    fun `example 16`() {
        val nums = intArrayOf(1, 3, 5, 7, 9)
        assertThat(sut.tupleSameProduct(nums), `is`(0))
    }

    // 1부터 10까지
    @Test
    fun `example 17`() {
        val nums = IntArray(10) { it + 1 }
        assertThat(sut.tupleSameProduct(nums), `is`(72))
    }

    // 1부터 20까지
    @Test
    fun `example 18`() {
        val nums = IntArray(20) { it + 1 }
        assertThat(sut.tupleSameProduct(nums), `is`(536))
    }

    // 짝수 1~20
    @Test
    fun `example 19`() {
        val nums = IntArray(10) { (it + 1) * 2 }
        assertThat(sut.tupleSameProduct(nums), `is`(72))
    }

    // 3의 거듭제곱
    @Test
    fun `example 20`() {
        val nums = intArrayOf(1, 3, 9, 27, 81, 243)
        assertThat(sut.tupleSameProduct(nums), `is`(56))
    }

    // 약수 집합 (36)
    @Test
    fun `example 21`() {
        val nums = intArrayOf(1, 2, 3, 4, 6, 9, 12, 18, 36)
        assertThat(sut.tupleSameProduct(nums), `is`(176))
    }

    // 약수 집합 (60)
    @Test
    fun `example 22`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60)
        assertThat(sut.tupleSameProduct(nums), `is`(392))
    }

    // 정사각수 포함
    @Test
    fun `example 23`() {
        val nums = intArrayOf(1, 4, 9, 16, 36)
        assertThat(sut.tupleSameProduct(nums), `is`(16))
    }

    // 1부터 50까지
    @Test
    fun `example 24`() {
        val nums = IntArray(50) { it + 1 }
        assertThat(sut.tupleSameProduct(nums), `is`(5824))
    }

    // 1부터 100까지
    @Test
    fun `example 25`() {
        val nums = IntArray(100) { it + 1 }
        assertThat(sut.tupleSameProduct(nums), `is`(31_840))
    }

    // 원소 최대(1000개), 1부터 1000까지
    @Test
    fun `example 26`() {
        val nums = IntArray(1000) { it + 1 }
        assertThat(sut.tupleSameProduct(nums), `is`(5_894_072))
    }

    // 원소 최대(1000개), 최대값까지 큰 수
    @Test
    fun `example 27`() {
        val nums = IntArray(1000) { 9_001 + it }
        assertThat(sut.tupleSameProduct(nums), `is`(116_464))
    }

    // 원소 최대(1000개), 10의 배수
    @Test
    fun `example 28`() {
        val nums = IntArray(1000) { (it + 1) * 10 }
        assertThat(sut.tupleSameProduct(nums), `is`(5_894_072))
    }

    // 원소 최대(1000개), 홀수
    @Test
    fun `example 29`() {
        val nums = IntArray(1000) { it * 2 + 1 }
        assertThat(sut.tupleSameProduct(nums), `is`(2_040_984))
    }

    // 원소 최대(1000개), 서로 다른 소수 1000개 (같은 곱 없음)
    @Test
    fun `example 30`() {
        val nums = generateSequence(2) { it + 1 }
            .filter { n -> (2..n / 2).none { n % it == 0 } }
            .take(1000).toList().toIntArray()
        assertThat(sut.tupleSameProduct(nums), `is`(0))
    }
}
