package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P64061Test {
    val p = P64061()

    @Test
    fun `example 1`() {
        assertThat(p.solution(
                Array(5) { IntArray(5) { 0 } }.apply {
                    this[0] = intArrayOf(0, 0, 0, 0, 0)
                    this[1] = intArrayOf(0, 0, 1, 0, 3)
                    this[2] = intArrayOf(0, 2, 5, 0, 1)
                    this[3] = intArrayOf(4, 2, 4, 4, 2)
                    this[4] = intArrayOf(3, 5, 1, 3, 1)
                },
                intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
        ), `is`(4))

        // map[1] = [4, 3]
        // map[2] = [2, 2, 5]
        // map[3] = [1, 5, 4, 1]
        // map[4] = [4, 3]
        // map[5] = [3, 1, 2, 1]
    }

}