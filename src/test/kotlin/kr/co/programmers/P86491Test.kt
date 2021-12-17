package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P86491Test {
    val p = P86491()

    @Test
    fun `example 01`() {
        assertThat(p.solution(arrayOf(
                intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40)
        )), `is`(4000))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(arrayOf(
                intArrayOf(10, 7), intArrayOf(12, 3), intArrayOf(8, 15), intArrayOf(14, 7), intArrayOf(5, 15)
        )), `is`(120))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(arrayOf(
                intArrayOf(14, 4), intArrayOf(19, 6), intArrayOf(6, 16), intArrayOf(18, 7), intArrayOf(7, 11)
        )), `is`(133))
    }

}
