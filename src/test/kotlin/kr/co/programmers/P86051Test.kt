package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P86051Test {
    val p = P86051()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(1, 2, 3, 4, 6, 7, 8, 0)), `is`(14))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(5, 8, 4, 0, 6, 7, 9)), `is`(6))
    }
}
