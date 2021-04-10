package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P67256Test {
    val p = P67256()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5), "right"),
            `is`("LRLLLRLLRRL")
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(intArrayOf(7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2), "left"),
            `is`("LRLLRRLLLRR")
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0), "right"),
            `is`("LLRLLRLLRL")
        )
    }

}
