package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P43165Test {
    val p = P43165()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(1, 1, 1, 1, 1), 3), `is`(5))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(1, 2, 3, 4, 5), 1), `is`(3))
    }

}
