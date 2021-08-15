package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

// https://github.com/antop-dev/algorithm/issues/220
class P71Test {
    val p = P71()

    @Test
    fun `example 01`() {
        assertThat(p.simplifyPath("/home/"), `is`("/home"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.simplifyPath("/../"), `is`("/"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.simplifyPath("/home//foo/"), `is`("/home/foo"))
    }

    @Test
    fun `example 04`() {
        assertThat(p.simplifyPath("/a/./b/../../c/"), `is`("/c"))
    }

}
