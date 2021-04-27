package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P77484Test {
    val p = P77484()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)),
            `is`(intArrayOf(3, 5))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(intArrayOf(0, 0, 0, 0, 0, 0), intArrayOf(38, 19, 20, 40, 15, 25)),
            `is`(intArrayOf(1, 6))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(intArrayOf(45, 4, 35, 20, 3, 9), intArrayOf(20, 9, 3, 45, 4, 35)),
            `is`(intArrayOf(1, 1))
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.solution(intArrayOf(1, 2, 3, 4, 5), intArrayOf(6, 7, 8, 9, 10)),
            `is`(intArrayOf(6, 6))
        )
    }

}
