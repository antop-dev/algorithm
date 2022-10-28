package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P131130Test {
    val sut = P131130()

    @Test
    fun `example 01`() {
        assertThat(sut.solution(intArrayOf(8, 6, 3, 7, 2, 5, 1, 4)), `is`(12))
    }

}
