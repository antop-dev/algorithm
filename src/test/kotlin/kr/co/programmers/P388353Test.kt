package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P388353Test {
    val sut = P388353()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                storage = arrayOf(
                    "AZWQY",
                    "CAABX",
                    "BBDDA",
                    "ACACA"
                ),
                requests = arrayOf("A", "BB", "A")
            ),
            `is`(11)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                storage = arrayOf("HAH", "HBH", "HHH", "HAH", "HBH"),
                requests = arrayOf("C", "B", "B", "B", "B", "H")
            ),
            `is`(4)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                storage = arrayOf("AAAAA", "ABCDA", "AGAEA", "AZAFA", "ZYAAA"),
                requests = arrayOf("BB", "DD", "Z", "Y", "Z", "G", "C", "E", "F")
            ),
            `is`(16)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                storage = arrayOf("AAAA", "ABAA", "ABAA", "ACAA", "AAAA"),
                requests = arrayOf("BB", "C")
            ),
            `is`(18)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.solution(
                storage = arrayOf("AAAA", "ABAA", "ABAA", "ACAA", "AAAA"),
                requests = arrayOf("BB", "C")
            ),
            `is`(18)
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.solution(
                storage = arrayOf("BBBB", "AAAB", "BBBB"),
                requests = arrayOf("B", "A")
            ),
            `is`(0)
        )
    }

    @Test
    fun `example 7`() {
        assertThat(
            sut.solution(
                storage = arrayOf("BBBB", "AAAB", "BBBB"),
                requests = arrayOf("A", "B")
            ),
            `is`(2)
        )
    }
}