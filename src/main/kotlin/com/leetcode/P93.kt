package com.leetcode

// https://github.com/antop-dev/algorithm/issues/331
class P93 {

    fun restoreIpAddresses(s: String): List<String> {
        if (s.length !in 4..12) {
            return listOf()
        }
        val ans = mutableListOf<String>()
        dfs(ans, s, 0, 0, StringBuilder())
        return ans
    }

    /**
     * @param ans 완성된 답이 담길 리스트
     * @param s 원본 문자열
     * @param i 문자열의 현재 인덱스
     * @param dots 사용된 쩜(".")의 개수
     * @param ip 만들어가고 있는 문자열
     */
    fun dfs(ans: MutableList<String>, s: String, i: Int, dots: Int, ip: StringBuilder) {
        // 쩜을 다 사용했지만 문자열을 다 소비 못한 경우
        if (dots == 4 && i < s.length) {
            return
        }

        if (i == s.length && dots == 4) { // 완성
            ans += ip.toString()
            return
        }

        val prevLength = ip.length // 백트래킹할 이전 문자열 길이
        if (i >= 1) { // 쩜이 한번 사용됨
            ip.append(".")
        }

        var num = 0
        // 한자리, 두자리, 세자리 계산
        val maxIndex = minOf(s.lastIndex - (3 - dots), i + 2)
        for (j in i..maxIndex) {
            val ch = s[j]
            // IP는 0 ~ 225만 허용된다.
            num = (num * 10) + (ch - '0')
            if (num > 255) break

            ip.append(ch)
            dfs(ans, s, j + 1, dots + 1, ip)

            // IP의 첫자리가 0이면 두세번째 자리는 패스
            if (num == 0) break
        }
        // 백트래킹
        ip.setLength(prevLength)
    }

}
