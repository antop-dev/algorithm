package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P678Test {
    val p = P678()

    @Test
    fun `example 01`() {
        assertThat(p.checkValidString("()"), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.checkValidString("(*)"), `is`(true))
    }

    @Test
    fun `example 03`() {
        assertThat(p.checkValidString("(*))"), `is`(true))
    }

    @Test
    fun `example 04`() {
        assertThat(p.checkValidString("(*)))"), `is`(false))
    }

    @Test
    fun `example 05`() {
        assertThat(p.checkValidString("*"), `is`(true))
    }

    @Test
    fun `example 06`() {
        assertThat(p.checkValidString("**"), `is`(true))
    }

    @Test
    fun `example 07`() {
        assertThat(p.checkValidString("***"), `is`(true))
    }

    @Test
    fun `example 08`() {
        assertThat(p.checkValidString("((*)"), `is`(true))
    }

    @Test
    fun `example 09`() {
        assertThat(p.checkValidString("(()*"), `is`(true))
    }

    @Test
    fun `example 10`() {
        assertThat(p.checkValidString("*())"), `is`(true))
    }

    @Test
    fun `example 11`() {
        assertThat(p.checkValidString("*()"), `is`(true))
    }

    @Test
    fun `example 12`() {
        assertThat(p.checkValidString("()*"), `is`(true))
    }

    @Test
    fun `example 13`() {
        assertThat(p.checkValidString("**("), `is`(false))
    }

    @Test
    fun `example 99`() {
        assertThat(
            p.checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"),
            `is`(false)
        )
    }

    @Test
    fun `example 98`() {
        assertThat(
            p.checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"),
            `is`(true)
        )
    }

    @Test
    fun `example 97`() {
        assertThat(
            p.checkValidString("((()))()(())(*()()())**(())()()()()((*()*))((*()*)"),
            `is`(true)
        )
    }

}
