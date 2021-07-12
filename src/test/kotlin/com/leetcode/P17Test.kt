package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P17Test {
    val p = P17()

    @Test
    fun `example 01`() {
        assertThat(
            p.letterCombinations(digits = "23"),
            `is`(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.letterCombinations(digits = ""),
            `is`(listOf())
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.letterCombinations(digits = "2"),
            `is`(listOf("a", "b", "c"))
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.letterCombinations(digits = "2459"),
            `is`(
                listOf(
                    "agjw",
                    "agjx",
                    "agjy",
                    "agjz",
                    "agkw",
                    "agkx",
                    "agky",
                    "agkz",
                    "aglw",
                    "aglx",
                    "agly",
                    "aglz",
                    "ahjw",
                    "ahjx",
                    "ahjy",
                    "ahjz",
                    "ahkw",
                    "ahkx",
                    "ahky",
                    "ahkz",
                    "ahlw",
                    "ahlx",
                    "ahly",
                    "ahlz",
                    "aijw",
                    "aijx",
                    "aijy",
                    "aijz",
                    "aikw",
                    "aikx",
                    "aiky",
                    "aikz",
                    "ailw",
                    "ailx",
                    "aily",
                    "ailz",
                    "bgjw",
                    "bgjx",
                    "bgjy",
                    "bgjz",
                    "bgkw",
                    "bgkx",
                    "bgky",
                    "bgkz",
                    "bglw",
                    "bglx",
                    "bgly",
                    "bglz",
                    "bhjw",
                    "bhjx",
                    "bhjy",
                    "bhjz",
                    "bhkw",
                    "bhkx",
                    "bhky",
                    "bhkz",
                    "bhlw",
                    "bhlx",
                    "bhly",
                    "bhlz",
                    "bijw",
                    "bijx",
                    "bijy",
                    "bijz",
                    "bikw",
                    "bikx",
                    "biky",
                    "bikz",
                    "bilw",
                    "bilx",
                    "bily",
                    "bilz",
                    "cgjw",
                    "cgjx",
                    "cgjy",
                    "cgjz",
                    "cgkw",
                    "cgkx",
                    "cgky",
                    "cgkz",
                    "cglw",
                    "cglx",
                    "cgly",
                    "cglz",
                    "chjw",
                    "chjx",
                    "chjy",
                    "chjz",
                    "chkw",
                    "chkx",
                    "chky",
                    "chkz",
                    "chlw",
                    "chlx",
                    "chly",
                    "chlz",
                    "cijw",
                    "cijx",
                    "cijy",
                    "cijz",
                    "cikw",
                    "cikx",
                    "ciky",
                    "cikz",
                    "cilw",
                    "cilx",
                    "cily",
                    "cilz"
                )
            )
        )
    }

}
