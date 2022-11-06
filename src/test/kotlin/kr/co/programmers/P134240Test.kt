package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P134240Test {
    val sut = P134240()

    @Test
    fun `example 01`() {
        assertThat(sut.solution(intArrayOf(1, 3, 4, 6)), `is`("1223330333221"))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.solution(intArrayOf(1, 7, 1, 2)), `is`("111303111"))
    }

}
