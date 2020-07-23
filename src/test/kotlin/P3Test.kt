import com.leetcode.P3
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P3Test {
    val p = P3()

    @Test
    fun `example 01`() {
        val s = "abcabcbb"
        val length = p.lengthOfLongestSubstring(s)
        assertThat(length, `is`(3))
    }

    @Test
    fun `example 02`() {
        val s = "bbbbb"
        val length = p.lengthOfLongestSubstring(s)
        assertThat(length, `is`(1))
    }

    @Test
    fun `example 03`() {
        val s = "pwwkew"
        val length = p.lengthOfLongestSubstring(s)
        assertThat(length, `is`(3))
    }

    @Test
    fun `example 04`() {
        val s = "aaaaazxc"
        val length = p.lengthOfLongestSubstring(s)
        assertThat(length, `is`(4))
    }

}
