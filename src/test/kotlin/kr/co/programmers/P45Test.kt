package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P45Test {
    val sut = P45()

    @Test
    fun `example 1`() {
        assertThat(sut.jump(intArrayOf(2, 3, 1, 1, 4)), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.jump(intArrayOf(2, 3, 0, 1, 4)), `is`(2))
    }

}
