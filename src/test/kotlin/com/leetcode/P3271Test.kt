package com.leetcode

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

class P3271Test : AnnotationSpec() {
    val sut = P3271()

    @Test
    fun `example 1`() {
        sut.stringHash("abcd", 2) shouldBe "bf"
    }

    @Test
    fun `example 2`() {
        sut.stringHash("mxz", 3) shouldBe "i"
    }
}
