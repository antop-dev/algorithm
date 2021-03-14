package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P68644Test {
    val p = P68644()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(2, 1, 3, 4, 1)), `is`(intArrayOf(2, 3, 4, 5, 6, 7)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(5, 0, 2, 7)), `is`(intArrayOf(2, 5, 7, 9, 12)))
    }

}
