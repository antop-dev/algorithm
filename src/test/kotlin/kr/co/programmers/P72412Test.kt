package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P72412Test {
    val p = P72412()

    @Test
    fun solution() {
        assertThat(
            p.solution(
                arrayOf(
                    "java backend junior pizza 150",
                    "python frontend senior chicken 210",
                    "python frontend senior chicken 150",
                    "cpp backend senior pizza 260",
                    "java backend junior chicken 80",
                    "python backend senior chicken 50"
                ),
                arrayOf(
                    "java and backend and junior and pizza 100",
                    "python and frontend and senior and chicken 200",
                    "cpp and - and senior and pizza 250",
                    "- and backend and senior and - 150",
                    "- and - and - and chicken 100",
                    "- and - and - and - 150"
                )
            ),
            `is`(intArrayOf(1, 1, 1, 1, 2, 4))
        )
    }
}
