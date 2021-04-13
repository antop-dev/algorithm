package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42586Test {
    val p = P42586()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5)),
            `is`(intArrayOf(2, 1))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(intArrayOf(95, 90, 99, 99, 80, 99), intArrayOf(1, 1, 1, 1, 1, 1)),
            `is`(intArrayOf(1, 3, 2))
        )
    }
}
