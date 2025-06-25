package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1233Test {
    val sut = P1233()

    @Test
    fun `example 1`() {
        assertThat(
            sut.removeSubfolders(arrayOf("/a", "/a/b", "/c/d", "/c/d/e", "/c/f")),
            `is`(listOf("/a", "/c/d", "/c/f"))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.removeSubfolders(arrayOf("/a", "/a/b/c", "/a/b/d")),
            `is`(listOf("/a"))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.removeSubfolders(arrayOf("/a/b/c", "/a/b/ca", "/a/b/d")),
            `is`(listOf("/a/b/c", "/a/b/ca", "/a/b/d"))
        )
    }
}