package com.leetcode

// https://github.com/antop-dev/algorithm/issues/664
class P1233 {
    fun removeSubfolders(folder: Array<String>): List<String> {
        folder.sort()
        val ans = mutableListOf(folder[0])
        for (f in folder.drop(1)) {
            val prev = ans.last() + "/"
            if (!f.startsWith(prev)) {
                ans += f
            }
        }
        return ans
    }
}