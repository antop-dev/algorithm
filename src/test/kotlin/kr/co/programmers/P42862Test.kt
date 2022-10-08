package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42862Test {
    val p = P42862()

    @Test
    fun `example 01`() {
        assertThat(p.solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5)), `is`(5))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(5, intArrayOf(2, 4), intArrayOf(3)), `is`(4))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(3, intArrayOf(3), intArrayOf(1)), `is`(2))
    }

}
