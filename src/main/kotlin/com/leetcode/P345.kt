package com.leetcode

// https://leetcode.com/problems/reverse-vowels-of-a-string/
class P345 {
    fun reverseVowels(s: String): String {
        val vowels = charArrayOf('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u')
        val chars = s.toCharArray()

        var i = 0
        var j = s.lastIndex
        var direction = 1 // 방향

        while (i < j) {
            if (direction > 0) {
                if (chars[i] in vowels) {
                    direction = -1
                } else {
                    i++
                }
            } else {
                if (chars[j] in vowels) {
                    val tmp = chars[i]
                    chars[i] = chars[j]
                    chars[j] = tmp

                    direction = 1
                    i++
                }
                j--
            }
        }

        return chars.joinToString("")
    }
}
