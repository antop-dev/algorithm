package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P92334Test {
    val p = P92334()

    @Test
    fun `example 01`() {
        assertThat(
                p.solution(
                        arrayOf("muzi", "frodo", "apeach", "neo"),
                        arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"),
                        2
                ),
                `is`(intArrayOf(2, 1, 1, 0))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
                p.solution(
                        arrayOf("con", "ryan"),
                        arrayOf("ryan con", "ryan con", "ryan con", "ryan con"),
                        3
                ),
                `is`(intArrayOf(0, 0))
        )
    }

}
