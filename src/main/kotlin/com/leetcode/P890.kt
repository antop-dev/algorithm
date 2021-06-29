package com.leetcode

// https://github.com/antop-dev/algorithm/issues/289
class P890 {
    private val pool = ('A'..'Z').toList()

    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
        val p = pattern(pattern)
        return words.filter { pattern(it) == p }
    }

    private fun pattern(s: String): String {
        val array = IntArray(26) { -1 }
        var j = 0
        val sb = StringBuffer()
        for (c in s) {
            val i = c - 'a'
            if (array[i] == -1) array[i] = j++
            sb.append(pool[array[i]])
        }
        return sb.toString()
    }

}
