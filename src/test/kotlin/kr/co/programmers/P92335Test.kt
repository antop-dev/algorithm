package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

class P92335Test {
    private val sup = P92335()

    @Test
    fun `example 01`() {
        assertThat(sup.solution(437674, 3), Matchers.`is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(sup.solution(110011, 10), Matchers.`is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(sup.solution(Int.MAX_VALUE, 2), Matchers.`is`(0))
    }

}
