package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P4045Test {
    private val sut = P4045()

    // 문제 예제 1
    @Test
    fun `example 01`() {
        val position = intArrayOf(1, 5, 6, 20)
        val speed = intArrayOf(4, 3, 2, 3)
        assertThat(sut.countGroups(position, speed, 1), `is`(2))
    }

    // 문제 예제 2
    @Test
    fun `example 02`() {
        val position = intArrayOf(1, 5, 9)
        val speed = intArrayOf(3, 2, 2)
        assertThat(sut.countGroups(position, speed, 2), `is`(2))
    }

    // 문제 예제 3
    @Test
    fun `example 03`() {
        val position = intArrayOf(9)
        val speed = intArrayOf(8)
        assertThat(sut.countGroups(position, speed, 5), `is`(1))
    }

    // 로봇이 최소(1대)이고 모든 값이 최소
    @Test
    fun `example 04`() {
        val position = intArrayOf(1)
        val speed = intArrayOf(1)
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 로봇 1대, 모든 값이 최대
    @Test
    fun `example 05`() {
        val position = intArrayOf(1_000_000_000)
        val speed = intArrayOf(1_000_000_000)
        assertThat(sut.countGroups(position, speed, 1_000_000_000), `is`(1))
    }

    // 처음부터 거리 이내라 바로 병합
    @Test
    fun `example 06`() {
        val position = intArrayOf(1, 2)
        val speed = intArrayOf(1, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 같은 속도로 거리 밖이라 병합 안됨
    @Test
    fun `example 07`() {
        val position = intArrayOf(1, 3)
        val speed = intArrayOf(1, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(2))
    }

    // 왼쪽이 더 빨라서 따라잡음
    @Test
    fun `example 08`() {
        val position = intArrayOf(1, 3)
        val speed = intArrayOf(2, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 오른쪽이 더 빨라서 멀어짐
    @Test
    fun `example 09`() {
        val position = intArrayOf(1, 3)
        val speed = intArrayOf(1, 2)
        assertThat(sut.countGroups(position, speed, 1), `is`(2))
    }

    // 모든 로봇이 처음부터 연쇄 병합
    @Test
    fun `example 10`() {
        val position = intArrayOf(1, 2, 3, 4, 5)
        val speed = intArrayOf(1, 1, 1, 1, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 모두 같은 속도, 간격이 거리보다 큼
    @Test
    fun `example 11`() {
        val position = intArrayOf(1, 3, 5, 7, 9)
        val speed = intArrayOf(1, 1, 1, 1, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(5))
    }

    // 속도가 감소하여 모두 합쳐짐
    @Test
    fun `example 12`() {
        val position = intArrayOf(1, 3, 5, 7, 9)
        val speed = intArrayOf(5, 4, 3, 2, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 속도가 증가하여 아무도 합쳐지지 않음
    @Test
    fun `example 13`() {
        val position = intArrayOf(1, 3, 5, 7, 9)
        val speed = intArrayOf(1, 2, 3, 4, 5)
        assertThat(sut.countGroups(position, speed, 1), `is`(5))
    }

    // 빠름/느림 교대
    @Test
    fun `example 14`() {
        val position = intArrayOf(1, 10, 20, 30)
        val speed = intArrayOf(10, 1, 10, 1)
        assertThat(sut.countGroups(position, speed, 2), `is`(2))
    }

    // 가운데가 빨라 오른쪽과 합쳐짐
    @Test
    fun `example 15`() {
        val position = intArrayOf(1, 4, 7)
        val speed = intArrayOf(1, 3, 2)
        assertThat(sut.countGroups(position, speed, 2), `is`(2))
    }

    // 왼쪽이 가운데와 합쳐짐
    @Test
    fun `example 16`() {
        val position = intArrayOf(1, 4, 7)
        val speed = intArrayOf(2, 1, 3)
        assertThat(sut.countGroups(position, speed, 1), `is`(2))
    }

    // 거리가 큰 경우 따라잡음
    @Test
    fun `example 17`() {
        val position = intArrayOf(1, 100)
        val speed = intArrayOf(100, 1)
        assertThat(sut.countGroups(position, speed, 98), `is`(1))
    }

    // 처음 간격과 거리가 같음
    @Test
    fun `example 18`() {
        val position = intArrayOf(1, 100)
        val speed = intArrayOf(100, 1)
        assertThat(sut.countGroups(position, speed, 99), `is`(1))
    }

    // 병합 후 오른쪽 로봇 속도로 따라잡힘
    @Test
    fun `example 19`() {
        val position = intArrayOf(1, 10, 11, 30)
        val speed = intArrayOf(5, 1, 9, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 같은 속도, 일부만 거리 이내
    @Test
    fun `example 20`() {
        val position = intArrayOf(1, 5, 10, 15)
        val speed = intArrayOf(3, 3, 3, 3)
        assertThat(sut.countGroups(position, speed, 4), `is`(3))
    }

    // 같은 속도, 모든 간격이 거리 이내
    @Test
    fun `example 21`() {
        val position = intArrayOf(1, 5, 10, 15)
        val speed = intArrayOf(3, 3, 3, 3)
        assertThat(sut.countGroups(position, speed, 5), `is`(1))
    }

    // 병합 그룹이 느린 로봇 속도를 따름
    @Test
    fun `example 22`() {
        val position = intArrayOf(1, 6, 7, 8, 20)
        val speed = intArrayOf(2, 1, 5, 1, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(2))
    }

    // 위치 양 끝, 왼쪽 속도 최대
    @Test
    fun `example 23`() {
        val position = intArrayOf(1, 1_000_000_000)
        val speed = intArrayOf(1_000_000_000, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 위치 양 끝, 오른쪽 속도 최대
    @Test
    fun `example 24`() {
        val position = intArrayOf(1, 1_000_000_000)
        val speed = intArrayOf(1, 1_000_000_000)
        assertThat(sut.countGroups(position, speed, 1), `is`(2))
    }

    // 속도가 절반씩 감소
    @Test
    fun `example 25`() {
        val position = intArrayOf(2, 4, 8, 16, 32, 64)
        val speed = intArrayOf(64, 32, 16, 8, 4, 2)
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 같은 속도, 간격이 점점 커짐
    @Test
    fun `example 26`() {
        val position = intArrayOf(1, 2, 4, 7, 11)
        val speed = intArrayOf(1, 1, 1, 1, 1)
        assertThat(sut.countGroups(position, speed, 2), `is`(3))
    }

    // 로봇 최대(100,000대), 처음부터 모두 병합
    @Test
    fun `example 27`() {
        val position = IntArray(100_000) { it + 1 }
        val speed = IntArray(100_000) { 1 }
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 로봇 최대(100,000대), 같은 속도로 병합 없음
    @Test
    fun `example 28`() {
        val position = IntArray(100_000) { (it + 1) * 10_000 }
        val speed = IntArray(100_000) { 1_000_000_000 }
        assertThat(sut.countGroups(position, speed, 1), `is`(100_000))
    }

    // 로봇 최대(100,000대), 속도가 감소하여 모두 병합
    @Test
    fun `example 29`() {
        val position = IntArray(100_000) { (it + 1) * 10_000 }
        val speed = IntArray(100_000) { 100_000 - it }
        assertThat(sut.countGroups(position, speed, 1), `is`(1))
    }

    // 로봇 최대(100,000대), 속도가 증가하여 병합 없음
    @Test
    fun `example 30`() {
        val position = IntArray(100_000) { (it + 1) * 10_000 }
        val speed = IntArray(100_000) { it + 1 }
        assertThat(sut.countGroups(position, speed, 1), `is`(100_000))
    }

    @Test
    fun `example 31`() {
        val position = intArrayOf(677, 711, 942, 960)
        val speed = intArrayOf(774, 951, 743, 516)
        assertThat(sut.countGroups(position, speed, 27), `is`(1))
    }

    @Test
    fun `example 32`() {
        val position = intArrayOf(1,3,8)
        val speed = intArrayOf(10, 1, 1)
        assertThat(sut.countGroups(position, speed, 1), `is`(2))
    }
}
