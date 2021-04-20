package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P68645Test {
    val p = P68645()

    @Test
    fun `example 01`() {
        assertThat(p.solution(4), `is`(intArrayOf(1, 2, 9, 3, 10, 8, 4, 5, 6, 7)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(5), `is`(intArrayOf(1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9)))
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(6),
            `is`(intArrayOf(1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11))
        )
    }

}
