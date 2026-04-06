package com.leetcode

// https://github.com/antop-dev/algorithm/issues/737
class P3227 {
    fun doesAliceWin(s: String): Boolean {
        // 모음의 갯수 카운팅
        var count = 0
        for (ch in s) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++
            }
        }
        // 모음의 갯수가 하나라도 있으면 엘리스가 무조건 이긴다
        return count > 0
    }
}
