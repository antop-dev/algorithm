package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P176962Test {
    val sut = P176962()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(
                arrayOf(
                        arrayOf("korean", "11:40", "30"),
                        arrayOf("english", "12:10", "20"),
                        arrayOf("math", "12:30", "40")
                )
        ), `is`(arrayOf("korean", "english", "math")))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(
                arrayOf(
                        arrayOf("science", "12:40", "50"),
                        arrayOf("music", "12:20", "40"),
                        arrayOf("history", "14:00", "30"),
                        arrayOf("computer", "12:30", "100")
                )
        ), `is`(arrayOf("science", "history", "computer", "music")))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(
                arrayOf(
                        arrayOf("aaa", "12:00", "20"),
                        arrayOf("bbb", "12:10", "30"),
                        arrayOf("ccc", "12:40", "10")
                )
        ), `is`(arrayOf("bbb", "ccc", "aaa")))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.solution(
                arrayOf(
                        arrayOf("aaa", "12:00", "30"),
                        arrayOf("bbb", "12:10", "30"),
                        arrayOf("ccc", "14:00", "00")
                )
        ), `is`(arrayOf("bbb", "aaa", "ccc")))
    }

}
