package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P152995Test {
    val sut = P152995()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(2, 2),
                    intArrayOf(1, 4),
                    intArrayOf(3, 2),
                    intArrayOf(3, 2),
                    intArrayOf(2, 1)
                )
            ), `is`(4)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(2, 1), // 4번째 사람에 의해서 -1
                    intArrayOf(2, 2),
                    intArrayOf(1, 4),
                    intArrayOf(3, 2)
                )
            ), `is`(-1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, 4), // 2등
                    intArrayOf(1, 7), // 1등
                    intArrayOf(0, 6) // 완호보다 총점은 높지만 두번째 사람보다 점수가 둘 다 낮다.
                )
            ), `is`(2)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(2, 2), // 3등
                    intArrayOf(2, 2),
                    intArrayOf(2, 3), // 1등
                    intArrayOf(3, 2) // 1등
                )
            ), `is`(3)
        )
    }
}
