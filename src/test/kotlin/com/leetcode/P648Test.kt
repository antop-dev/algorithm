package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P648Test {
    val p = P648()

    @Test
    fun `example 01`() {
        assertThat(
            p.replaceWords(listOf("cat", "bat", "rat"), "the cattle was rattled by the battery"),
            `is`("the cat was rat by the bat")
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.replaceWords(listOf("a", "b", "c"), "aadsfasf absbs bbab cadsfafs"),
            `is`("a a b c")
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.replaceWords(listOf("a", "aa", "aaa", "aaaa"), "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"),
            `is`("a a a a a a a a bbb baba a")
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.replaceWords(listOf("catt", "cat", "bat", "rat"), "the cattle was rattled by the battery"),
            `is`("the cat was rat by the bat")
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.replaceWords(listOf("ac", "ab"), "it is abnormal that this solution is accepted"),
            `is`("it is ab that this solution is ac")
        )
    }

}
