package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P154539Test {
    val sut = P154539()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(intArrayOf(2, 3, 3, 5)), `is`(intArrayOf(3, 5, 5, -1)))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(intArrayOf(9, 1, 5, 3, 6, 2)), `is`(intArrayOf(-1, 5, 6, 6, -1, -1)))
    }

}
