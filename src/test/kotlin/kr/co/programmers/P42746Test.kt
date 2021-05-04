package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42746Test {
    val p = P42746()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(6, 10, 2)), `is`("6210"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(3, 30, 34, 5, 9)), `is`("9534330"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(intArrayOf(0, 0, 0, 0)), `is`("0"))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution(intArrayOf(15, 151)), `is`("15151"))
    }

    @Test
    fun `example 05`() {
        assertThat(p.solution(intArrayOf(12, 1)), `is`("121"))
    }

    @Test
    fun `example 06`() {
        assertThat(p.solution(intArrayOf(10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), `is`("987654321101000"))
    }

    @Test
    fun `example 07`() {
        assertThat(p.solution(intArrayOf(412, 41)), `is`("41412"))
    }

    @Test
    fun `example 08`() {
        assertThat(p.solution(intArrayOf(30, 303)), `is`("30330"))
    }

    @Test
    fun `example 09`() {
        assertThat(p.solution(intArrayOf(2, 20, 200)), `is`("220200"))
    }

    @Test
    fun `example 10`() {
        assertThat(p.solution(intArrayOf(20, 200, 2)), `is`("220200"))
    }

    @Test
    fun `example 11`() {
        assertThat(p.solution(intArrayOf(10, 101)), `is`("10110"))
    }

    @Test
    fun `example 12`() {
        assertThat(p.solution(intArrayOf(1, 11, 111, 1111)), `is`("1111111111"))
    }

    @Test
    fun `example 13`() {
        assertThat(p.solution(intArrayOf(0, 0, 70)), `is`("7000"))
    }

    @Test
    fun `example 14`() {
        assertThat(p.solution(intArrayOf(0, 0, 0, 1000)), `is`("1000000"))
    }

    @Test
    fun `example 15`() {
        assertThat(p.solution(intArrayOf(0, 0, 1000, 0)), `is`("1000000"))
    }

    @Test
    fun `example 16`() {
        assertThat(p.solution(intArrayOf(1, 2, 3, 1, 1, 3)), `is`("332111"))
    }

}
