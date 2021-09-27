package com.leetcode

// https://github.com/antop-dev/algorithm/issues/331
class P93 {
    val answer = mutableListOf<String>()

    fun restoreIpAddresses(s: String): List<String> {
        if (s.length !in 4..12) return listOf()
        dfs(s, 0, 0, StringBuffer())
        return answer
    }

    /**
     * @param s 원본 문자열
     * @param i 문자열의 현재 인덱스
     * @param dots 사용된 쩜(".")의 개수
     * @param ip 만들어가고 있는 문자열
     */
    fun dfs(s: String, i: Int, dots: Int, ip: StringBuffer) {
        // 쩜을 다 사용했지만 문자열을 다 소비 못한 경우
        if (dots > 3 && i < s.length) {
            return
        }

        if (i == s.length && dots > 3) { // 완성
            answer += ip.toString()
            return
        }

        val prevLength = ip.length // 백트래킹할 이전 문자열 길이
        if (i > 0) ip.append(".") // 쩜이 한번 사용됨

        var num = 0
        // 한자리, 두자리, 세자리 계산
        val maxIndex = minOf(s.lastIndex - (3 - dots), i + 2)
        for (j in i..maxIndex) {
            val c = s[j]

            // IP는 0 ~ 225만 허용된다.
            num = (num * 10) + (c - '0')
            if (num > 255) break

            ip.append(c)
            dfs(s, j + 1, dots + 1, ip)

            // IP의 첫자리가 0이면 두세번째 자리는 패스
            if (num == 0) break
        }
        // 백트래킹
        ip.setLength(prevLength)
    }

}
