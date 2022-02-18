package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12951Test {
    val p = P12951()

    @Test
    fun `example 01`() {
        assertThat(p.solution("3people unFollowed me"), `is`("3people Unfollowed Me"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution("for the last week"), `is`("For The Last Week"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution("  adgagd 3eagdag "), `is`("  Adgagd 3eagdag "))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution("     "), `is`("     "))
    }

    @Test
    fun `example 05`() {
        assertThat(p.solution(" "), `is`(" "))
    }

    @Test
    fun `example 06`() {
        assertThat(p.solution("a"), `is`("A"))
    }

    @Test
    fun `example 07`() {
        assertThat(p.solution("A"), `is`("A"))
    }

    @Test
    fun `example 08`() {
        assertThat(p.solution("3"), `is`("3"))
    }
}
