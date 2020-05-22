package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P42579Test {
    val p = P42579()

    @Test
    fun `example 01`() {
        assertThat(
                p.solution(
                        arrayOf("classic", "pop", "classic", "classic", "pop"),
                        intArrayOf(500, 600, 150, 800, 2500)
                ),
                `is`(intArrayOf(4, 1, 3, 0))
        )
    }

    @Test
    fun `장르에 속한 곡이 하나라면, 하나의 곡만 선택`() {
        assertThat(
                p.solution(
                        arrayOf("classic", "pop", "classic", "classic"),
                        intArrayOf(500, 600, 150, 800)
                ),
                `is`(intArrayOf(3, 0, 1))
        )
    }
}
