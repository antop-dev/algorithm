package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P68646Test {
    val p = P68646()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(9, -1, -5)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(-16, 27, 65, -2, 58, -92, -71, -68, -61, -33)), `is`(6))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(intArrayOf(5, 7, 1, 8, 9)), `is`(4))
    }

}
