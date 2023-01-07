package com.leetcode

// https://github.com/antop-dev/algorithm/issues/453
class P165 {
    fun compareVersion(version1: String, version2: String): Int {
        val len = maxLength(version1, version2)
        val v1 = convert(version1, len)
        val v2 = convert(version2, len)

        v1.zip(v2) { a, b ->
            if (a > b) {
                return 1
            } else if (a < b) {
                return -1
            }
        }
        return 0
    }

    // 두 버전 중에 긴 버전의 길이를 구한다.
    private fun maxLength(v1: String, v2: String) = maxOf(countDot(v1), countDot(v2)) + 1

    // 쩜(".")의 개수를 구한다.
    private fun countDot(s: String) = s.count { it == '.' }

    // 정수 배열로 변경
    private fun convert(v: String, len: Int) = IntArray(len).apply {
        v.split(".").forEachIndexed { i, s -> this[i] = s.toInt() }
    }

}
