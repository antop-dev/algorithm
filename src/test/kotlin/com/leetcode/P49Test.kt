package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P49Test {
    val p = P49()

    @Test
    fun `example 01`() {
        assertThat(
            p.groupAnagrams(strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")),
            containsInAnyOrder(
                containsInAnyOrder("bat"),
                containsInAnyOrder("nat", "tan"),
                containsInAnyOrder("ate", "eat", "tea")
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.groupAnagrams(strs = arrayOf("")),
            `is`(listOf(listOf("")))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.groupAnagrams(strs = arrayOf("")),
            `is`(listOf(listOf("")))
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.groupAnagrams(strs = arrayOf("cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc")),
            containsInAnyOrder(
                containsInAnyOrder("max"),
                containsInAnyOrder("buy"),
                containsInAnyOrder("doc"),
                containsInAnyOrder("may"),
                containsInAnyOrder("ill"),
                containsInAnyOrder("duh"),
                containsInAnyOrder("tin"),
                containsInAnyOrder("bar"),
                containsInAnyOrder("pew"),
                containsInAnyOrder("cab")
            )
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.groupAnagrams(strs = arrayOf("ac", "d")),
            containsInAnyOrder(
                containsInAnyOrder("d"),
                containsInAnyOrder("ac")
            )
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            p.groupAnagrams(
                strs = arrayOf(
                    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                )
            ),
            containsInAnyOrder(
                containsInAnyOrder("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"),
                containsInAnyOrder("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
            )
        )
    }

}
