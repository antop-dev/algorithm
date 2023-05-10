package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P150368Test {
    val sut = P150368()

    @Test
    fun `example 1`() {
        val users = arrayOf(
            intArrayOf(40, 10000),
            intArrayOf(25, 10000)
        )
        val emoticons = intArrayOf(7000, 9000)
        assertThat(sut.solution(users, emoticons), `is`(intArrayOf(1, 5400)))
    }

    @Test
    fun `example 2`() {
        val users = arrayOf(
            intArrayOf(40, 2900),
            intArrayOf(23, 10000),
            intArrayOf(11, 5200),
            intArrayOf(5, 5900),
            intArrayOf(40, 3100),
            intArrayOf(27, 9200),
            intArrayOf(32, 6900)
        )
        val emoticons = intArrayOf(1300, 1500, 1600, 4900)
        assertThat(sut.solution(users, emoticons), `is`(intArrayOf(4, 13860)))
    }

}
