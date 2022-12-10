package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P142086Test {
    val sut = P142086()

    @Test
    fun `example 01`() {
        assertThat(sut.solution("banana"), `is`(intArrayOf(-1, -1, -1, 2, 2, 2)))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.solution("foobar"), `is`(intArrayOf(-1, -1, 1, -1, -1, -1)))
    }

}
