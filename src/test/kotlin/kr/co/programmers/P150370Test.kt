package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P150370Test {
    val sut = P150370()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                today = "2022.05.19",
                terms = arrayOf(
                    "A 6",
                    "B 12",
                    "C 3",
                ), privacies = arrayOf(
                    "2021.05.02 A",
                    "2021.07.01 B",
                    "2022.02.19 C",
                    "2022.02.20 C",
                )
            ),
            `is`(intArrayOf(1, 3))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                today = "2020.01.01",
                terms = arrayOf(
                    "Z 3", "D 5"
                ), privacies = arrayOf(
                    "2019.01.01 D",
                    "2019.11.15 Z",
                    "2019.08.02 D",
                    "2019.07.01 D",
                    "2018.12.28 Z"
                )
            ),
            `is`(intArrayOf(1, 4, 5))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                today = "2009.12.28",
                terms = arrayOf("A 13"),
                privacies = arrayOf("2008.11.03 A")
            ),
            `is`(intArrayOf(1))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                today = "2019.12.09",
                terms = arrayOf("A 12"),
                privacies = arrayOf("2018.12.10 A", "2010.10.10 A")
            ),
            `is`(intArrayOf(2))
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.solution(
                today = "2020.04.16",
                terms = arrayOf("A 36", "S 4"),
                privacies = arrayOf("2017.04.17 A", "2014.04.16 S")
            ),
            `is`(intArrayOf(2))
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.solution(
                today = "2020.12.28",
                terms = arrayOf("A 12", "B 1"),
                privacies = arrayOf("2019.01.01 A", "2020.11.28 B")
            ),
            `is`(intArrayOf(1, 2))
        )
    }

    @Test
    fun `example 7`() {
        assertThat(
            sut.solution(
                today = "2020.10.15",
                terms = arrayOf("A 100"),
                privacies = arrayOf("2018.06.16 A", "2008.02.15 A")
            ),
            `is`(intArrayOf(2))
        )
    }

    @Test
    fun `example 8`() {
        assertThat(
            sut.solution(
                today = "2020.10.15",
                terms = arrayOf("A 1"),
                privacies = arrayOf("2018.12.01 A")
            ),
            `is`(intArrayOf(1))
        )
    }

    @Test
    fun `example 9`() {
        assertThat(
            sut.solution(
                today = "2022.12.28",
                terms = arrayOf("A 10"),
                privacies = arrayOf("2020.01.01 A", "2022.02.28 A")
            ),
            `is`(intArrayOf(1, 2))
        )
    }
}
