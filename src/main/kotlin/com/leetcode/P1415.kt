package com.leetcode

// https://github.com/antop-dev/algorithm/issues/636
class P1415 {
    fun getHappyString(n: Int, k: Int): String {
        val comb = mutableListOf<String>()
        comb(n, comb, StringBuilder(), 0)
        return if (comb.size >= k) comb[k - 1] else ""
    }

    private fun comb(n: Int, comb: MutableList<String>, sb: StringBuilder, pos: Int) {
        if (pos == n) {
            comb += sb.toString()
            return
        }
        for (ch in 'a'..'c') {
            if (pos > 0 && sb[pos - 1] == ch) {
                continue
            }
            sb.append(ch)
            comb(n, comb, sb, pos + 1)
            sb.setLength(sb.length - 1) // backtracking
        }
    }
}
