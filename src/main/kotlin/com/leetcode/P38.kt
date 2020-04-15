package com.leetcode

// https://leetcode.com/problems/count-and-say/
class P38 {
    fun countAndSay(n: Int): String {
        if (n == 1) return "1"
        // 다른 자료구조를 사용하지 않고 문자열을 그대로 사용했다.
        // 빠른 속도를 원한다면 dp나 다른 자료구조를 사용해야 할 것이다.
        // 예) 5를 처리할 떄 4에서 만들어진 "1211"를 세면서 "111221"를 문자열 뒤에 붙인 후 앞의 "1211"을 제거한다.
        var s = "1"
        for (k in 2..n) {
            var pre = s[0]
            var count = 1
            val length = s.length
            for (i in 1 until length) {
                if (pre != s[i]) {
                    s += "$count$pre"
                    pre = s[i]
                    count = 0
                }
                count++
            }
            // 나머지 처리
            s += "$count$pre"
            // 이전에 처리한 문자열들 제거
            s = s.removeRange(0, length)

            // println("k = $k, s = $s")
        }
        return s
    }
}