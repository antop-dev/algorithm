package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P720Test {
    val p = P720()

    @Test
    fun `example 01`() {
        assertThat(p.longestWord(arrayOf("w", "wo", "wor", "worl", "world")), `is`("world"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.longestWord(arrayOf("a", "banana", "app", "appl", "ap", "apply", "apple")), `is`("apple"))
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.longestWord(
                arrayOf(
                    "ts",
                    "e",
                    "x",
                    "pbhj",
                    "opto",
                    "xhigy",
                    "erikz",
                    "pbh",
                    "opt",
                    "erikzb",
                    "eri",
                    "erik",
                    "xlye",
                    "xhig",
                    "optoj",
                    "optoje",
                    "xly",
                    "pb",
                    "xhi",
                    "x",
                    "o"
                )
            ), `is`("e")
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.longestWord(
                arrayOf(
                    "d",
                    "do",
                    "dog",
                    "p",
                    "pe",
                    "pen",
                    "peng",
                    "pengu",
                    "pengui",
                    "penguin",
                    "e",
                    "el",
                    "ele",
                    "elep",
                    "eleph",
                    "elepha",
                    "elephan",
                    "elephant"
                )
            ),
            `is`("elephant")
        )
    }

}
