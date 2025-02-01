package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P172928Test {
    val sut = P172928()

    @Test
    fun `example 1`() {
        val ans = sut.solution(arrayOf("SOO", "OOO", "OOO"), arrayOf("E 2", "S 2", "W 1"))
        assertThat(ans, `is`(intArrayOf(2, 1)))
    }

    @Test
    fun `example 2`() {
        val ans = sut.solution(arrayOf("SOO", "OXX", "OOO"), arrayOf("E 2", "S 2", "W 1"))
        assertThat(ans, `is`(intArrayOf(0, 1)))
    }

    @Test
    fun `example 3`() {
        val ans = sut.solution(arrayOf("OSO", "OOO", "OXO", "OOO"), arrayOf("E 2", "S 3", "W 1"))
        assertThat(ans, `is`(intArrayOf(0, 0)))
    }
}
