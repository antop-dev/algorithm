package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1472Test {

    @Test
    fun `example 01`() {
        val p = P1472("leetcode.com")
        // You are in "leetcode.com". Visit "google.com"
        p.visit("google.com")
        // You are in "google.com". Visit "facebook.com"
        p.visit("facebook.com")
        // You are in "facebook.com". Visit "youtube.com"
        p.visit("youtube.com")
        // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        assertThat(p.back(1), `is`("facebook.com"))
        // You are in "facebook.com", move back to "google.com" return "google.com"
        assertThat(p.back(1), `is`("google.com"))
        // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        assertThat(p.forward(1), `is`("facebook.com"))
        // You are in "facebook.com". Visit "linkedin.com"
        p.visit("linkedin.com")
        // You are in "linkedin.com", you cannot move forward any steps.
        assertThat(p.forward(2), `is`("linkedin.com"))
        // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        assertThat(p.back(2), `is`("google.com"))
        // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
        assertThat(p.back(7), `is`("leetcode.com"))
    }

    @Test
    fun `example 02`() {
        val p = P1472("zav.com")
        p.visit("kni.com")
        assertThat(p.back(7), `is`("zav.com"))
        assertThat(p.back(7), `is`("zav.com"))
        assertThat(p.forward(5), `is`("kni.com"))
        assertThat(p.forward(1), `is`("kni.com"))
        p.visit("pwrrbnw.com")
        p.visit("mosohif.com")
        assertThat(p.back(9), `is`("zav.com"))
    }

}
