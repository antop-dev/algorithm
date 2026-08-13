package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P131129Test {
    private val sut = P131129()

    @Test
    fun `example 01`() {
        val target = 21
        assertThat(sut.solution(target), `is`(intArrayOf(1, 0)))
    }

    @Test
    fun `example 02`() {
        val target = 58
        assertThat(sut.solution(target), `is`(intArrayOf(2, 2)))
    }

    @Test
    fun `example 03`() {
        val target = 1
        assertThat(sut.solution(target), `is`(intArrayOf(1, 1)))
    }

    @Test
    fun `example 04`() {
        val target = 2
        assertThat(sut.solution(target), `is`(intArrayOf(1, 1)))
    }

    @Test
    fun `example 05`() {
        val target = 3
        assertThat(sut.solution(target), `is`(intArrayOf(1, 1)))
    }

    @Test
    fun `example 06`() {
        val target = 20
        assertThat(sut.solution(target), `is`(intArrayOf(1, 1)))
    }

    @Test
    fun `example 07`() {
        val target = 40
        assertThat(sut.solution(target), `is`(intArrayOf(1, 0)))
    }

    @Test
    fun `example 08`() {
        val target = 50
        assertThat(sut.solution(target), `is`(intArrayOf(1, 1)))
    }

    @Test
    fun `example 09`() {
        val target = 51
        assertThat(sut.solution(target), `is`(intArrayOf(1, 0)))
    }

    @Test
    fun `example 10`() {
        val target = 57
        assertThat(sut.solution(target), `is`(intArrayOf(1, 0)))
    }

    @Test
    fun `example 11`() {
        val target = 59
        assertThat(sut.solution(target), `is`(intArrayOf(2, 2)))
    }

    @Test
    fun `example 12`() {
        val target = 60
        assertThat(sut.solution(target), `is`(intArrayOf(1, 0)))
    }

    @Test
    fun `example 13`() {
        val target = 61
        assertThat(sut.solution(target), `is`(intArrayOf(2, 2)))
    }

    @Test
    fun `example 14`() {
        val target = 100
        assertThat(sut.solution(target), `is`(intArrayOf(2, 2)))
    }

    @Test
    fun `example 15`() {
        val target = 101
        assertThat(sut.solution(target), `is`(intArrayOf(2, 1)))
    }

    @Test
    fun `example 16`() {
        val target = 110
        assertThat(sut.solution(target), `is`(intArrayOf(2, 1)))
    }

    @Test
    fun `example 17`() {
        val target = 120
        assertThat(sut.solution(target), `is`(intArrayOf(2, 0)))
    }

    @Test
    fun `example 18`() {
        val target = 150
        assertThat(sut.solution(target), `is`(intArrayOf(3, 3)))
    }

    @Test
    fun `example 19`() {
        val target = 180
        assertThat(sut.solution(target), `is`(intArrayOf(3, 0)))
    }

    @Test
    fun `example 20`() {
        val target = 181
        assertThat(sut.solution(target), `is`(intArrayOf(4, 2)))
    }

    @Test
    fun `example 21`() {
        val target = 200
        assertThat(sut.solution(target), `is`(intArrayOf(4, 4)))
    }

    @Test
    fun `example 22`() {
        val target = 250
        assertThat(sut.solution(target), `is`(intArrayOf(5, 5)))
    }

    @Test
    fun `example 23`() {
        val target = 300
        assertThat(sut.solution(target), `is`(intArrayOf(5, 0)))
    }

    @Test
    fun `example 24`() {
        val target = 500
        assertThat(sut.solution(target), `is`(intArrayOf(9, 4)))
    }

    @Test
    fun `example 25`() {
        val target = 1000
        assertThat(sut.solution(target), `is`(intArrayOf(17, 2)))
    }

    @Test
    fun `example 26`() {
        val target = 5000
        assertThat(sut.solution(target), `is`(intArrayOf(84, 4)))
    }

    @Test
    fun `example 27`() {
        val target = 12345
        assertThat(sut.solution(target), `is`(intArrayOf(206, 0)))
    }

    @Test
    fun `example 28`() {
        val target = 54321
        assertThat(sut.solution(target), `is`(intArrayOf(906, 3)))
    }

    @Test
    fun `example 29`() {
        val target = 99999
        assertThat(sut.solution(target), `is`(intArrayOf(1667, 0)))
    }

    @Test
    fun `example 30`() {
        val target = 294
        assertThat(sut.solution(target), `is`(intArrayOf(5, 0)))
    }

    @Test
    fun `example 31`() {
        val target = 29
        assertThat(sut.solution(target), `is`(intArrayOf(2, 2)))
    }
}
