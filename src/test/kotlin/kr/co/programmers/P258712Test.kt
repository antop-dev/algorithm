package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P258712Test {
    val sut = P258712()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                friends = arrayOf("muzi", "ryan", "frodo", "neo"),
                gifts = arrayOf(
                    "muzi frodo",
                    "muzi frodo",
                    "ryan muzi",
                    "ryan muzi",
                    "ryan muzi",
                    "frodo muzi",
                    "frodo ryan",
                    "neo muzi",
                )
            ), `is`(2)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                friends = arrayOf("joy", "brad", "alessandro", "conan", "david"),
                gifts = arrayOf(
                    "alessandro brad",
                    "alessandro joy",
                    "alessandro conan",
                    "david alessandro",
                    "alessandro david",
                )
            ), `is`(4)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                friends = arrayOf("a", "b", "c"),
                gifts = arrayOf("a b", "b a", "c a", "a c", "a c", "c a")
            ), `is`(0)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                friends = arrayOf("a", "an", "ant", "anto"),
                gifts = arrayOf(
                    "a ant",
                    "a ant",
                    "an a",
                    "an a",
                    "an a",
                    "ant a",
                    "ant an",
                    "anto a",
                )
            ), `is`(2)
        )
    }
}
