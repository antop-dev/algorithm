package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42583Test {
    val p = P42583()

    @Test
    fun `example 01`() {
        assertThat(p.solution(2, 10, intArrayOf(7, 4, 5, 6)), `is`(8))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(100, 100, intArrayOf(10)), `is`(101))
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(100, 100, intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10)),
            `is`(110)
        )
    }

}
