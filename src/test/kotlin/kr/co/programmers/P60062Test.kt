package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P60062Test {
    val sut = P60062()

    @Test
    fun `example 01`() {
        assertThat(sut.solution(12, intArrayOf(1, 5, 6, 10), intArrayOf(1, 2, 3, 4)), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.solution(12, intArrayOf(1, 3, 4, 9, 10), intArrayOf(3, 5, 7)), `is`(1))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.solution(12, intArrayOf(1, 5, 6, 10), intArrayOf(1)), `is`(-1))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.solution(12, intArrayOf(1, 5, 6, 10), intArrayOf(11)), `is`(1))
    }

    @Test
    fun `example 05`() {
        assertThat(sut.solution(8, intArrayOf(0, 3, 5, 7), intArrayOf(1, 1, 1, 1)), `is`(3))
    }

    @Test
    fun `example 06`() {
        assertThat(sut.solution(8, intArrayOf(0, 3, 5, 7), intArrayOf(7)), `is`(1))
    }

    @Test
    fun `example 07`() {
        assertThat(sut.solution(10, intArrayOf(0, 2, 4, 6, 8), intArrayOf(1, 1, 1, 1, 1)), `is`(5))
    }

    @Test
    fun `example 08`() {
        assertThat(sut.solution(10, intArrayOf(0, 2, 4, 6, 8), intArrayOf(2, 2, 2)), `is`(3))
    }

    @Test
    fun `example 09`() {
        assertThat(sut.solution(6, intArrayOf(0, 1, 2, 3, 4, 5), intArrayOf(5)), `is`(1))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.solution(6, intArrayOf(0, 1, 2, 3, 4, 5), intArrayOf(1, 1)), `is`(-1))
    }

    @Test
    fun `example 11`() {
        assertThat(sut.solution(20, intArrayOf(0, 5, 10, 15), intArrayOf(4, 4, 4, 4)), `is`(4))
    }

    @Test
    fun `example 12`() {
        assertThat(sut.solution(20, intArrayOf(0, 5, 10, 15), intArrayOf(5, 5)), `is`(2))
    }

    @Test
    fun `example 13`() {
        assertThat(sut.solution(20, intArrayOf(0, 5, 10, 15), intArrayOf(15)), `is`(1))
    }

    @Test
    fun `example 14`() {
        assertThat(sut.solution(4, intArrayOf(0), intArrayOf(1)), `is`(1))
    }

    @Test
    fun `example 15`() {
        assertThat(sut.solution(4, intArrayOf(0, 1, 2, 3), intArrayOf(3)), `is`(1))
    }

    @Test
    fun `example 16`() {
        assertThat(sut.solution(4, intArrayOf(0, 1, 2, 3), intArrayOf(1, 1)), `is`(2))
    }

    @Test
    fun `example 17`() {
        assertThat(sut.solution(100, intArrayOf(0, 50), intArrayOf(1, 1)), `is`(2))
    }

    @Test
    fun `example 18`() {
        assertThat(sut.solution(100, intArrayOf(0, 50), intArrayOf(50)), `is`(1))
    }

    @Test
    fun `example 19`() {
        assertThat(sut.solution(100, intArrayOf(1, 2, 3, 97, 98, 99), intArrayOf(2, 2)), `is`(2))
    }

    @Test
    fun `example 20`() {
        assertThat(sut.solution(100, intArrayOf(1, 2, 3, 97, 98, 99), intArrayOf(5)), `is`(-1))
    }

    @Test
    fun `example 21`() {
        assertThat(sut.solution(15, intArrayOf(0, 4, 8, 12), intArrayOf(3, 3, 3)), `is`(3))
    }

    @Test
    fun `example 22`() {
        assertThat(sut.solution(15, intArrayOf(0, 4, 8, 12), intArrayOf(4, 4)), `is`(2))
    }

    @Test
    fun `example 23`() {
        assertThat(sut.solution(15, intArrayOf(0, 4, 8, 12), intArrayOf(12)), `is`(1))
    }

    @Test
    fun `example 24`() {
        assertThat(sut.solution(9, intArrayOf(0, 3, 6), intArrayOf(2, 2, 2)), `is`(3))
    }

    @Test
    fun `example 25`() {
        assertThat(sut.solution(9, intArrayOf(0, 3, 6), intArrayOf(3, 3)), `is`(2))
    }

    @Test
    fun `example 26`() {
        assertThat(sut.solution(9, intArrayOf(0, 3, 6), intArrayOf(6)), `is`(1))
    }

    @Test
    fun `example 27`() {
        assertThat(sut.solution(200, intArrayOf(0, 10, 50, 80, 120, 199), intArrayOf(10, 10, 10)), `is`(-1))
    }

    @Test
    fun `example 28`() {
        assertThat(sut.solution(200, intArrayOf(0, 10, 50, 80, 120, 199), intArrayOf(100, 100)), `is`(2))
    }

    @Test
    fun `example 29`() {
        assertThat(sut.solution(30, intArrayOf(0, 7, 14, 21, 28), intArrayOf(6, 6, 6, 6)), `is`(4))
    }

    @Test
    fun `example 30`() {
        assertThat(sut.solution(30, intArrayOf(0, 7, 14, 21, 28), intArrayOf(7, 7, 7)), `is`(3))
    }

    @Test
    fun `example 31`() {
        assertThat(sut.solution(200, intArrayOf(0, 100), intArrayOf(1, 1)), `is`(2))
    }

    @Test
    fun `example 32`() {
        assertThat(sut.solution(50, intArrayOf(1), intArrayOf(6)), `is`(1))
    }

    @Test
    fun `example 33`() {
        assertThat(sut.solution(200, intArrayOf(0, 10, 50, 80, 120, 160), intArrayOf(1, 10, 5, 40, 30)), `is`(3))
    }

    @Test
    fun `example 34`() {
        assertThat(sut.solution(12, intArrayOf(2, 6, 7, 11), intArrayOf(1, 2, 3, 4)), `is`(2))
    }
}
