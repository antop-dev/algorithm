package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P86052Test {
    private val p = P86052()

    @Test
    fun `example 01`() {
        assertThat(p.solution(arrayOf("SL", "LR")), `is`(intArrayOf(16)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(arrayOf("S")), `is`(intArrayOf(1, 1, 1, 1)))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(arrayOf("R", "R")), `is`(intArrayOf(4, 4)))
    }
}
