package com.leetcode

// https://leetcode.com/problems/simplify-path/
class P71 {
    fun simplifyPath(path: String): String {
        val paths = mutableListOf<String>()
        for (p in path.split("/")) {
            when (p) {
                ".." -> {
                    if (paths.isNotEmpty()) {
                        paths.removeAt(paths.lastIndex)
                    }
                }
                ".", "" -> {
                }
                else -> paths += p
            }
        }
        return "/" + paths.joinToString("/")
    }
}
