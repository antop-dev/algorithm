package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/746
class P2182 {
    fun repeatLimitedString(s: String, repeatLimit: Int): String {
        // 키로 내림차순 정렬한 문자:횟수 맵
        val map = TreeMap<Char, Int> { a, b -> b - a }
        for (ch in s) {
            map[ch] = (map[ch] ?: 0) + 1
        }

        val sb = StringBuilder()
        while (map.isNotEmpty()) {
            // 사용해야할 문자를 꺼냄 (꺼낸다는게 중요하다)
            val (ch, count) = map.pollFirstEntry()
            // 반복해서 사용
            val repeat = minOf(repeatLimit, count)
            repeat(repeat) {
                sb.append(ch)
            }
            if (repeat < count) { // 현재 문자를 다 쓰지 못했다.
                // 다음 문자 1개를 소모시킨다.
                if (map.isEmpty()) { // 다음 문자가 없는 경우 중지
                    break
                }
                val next = map.firstKey() // 다음 문자가 지금 문자와 같은 경우 중지
                if (next == ch) {
                    break
                }
                // 다음 문자 한글자 사용
                sb.append(next)
                map[next] = (map[next] ?: 0) - 1
                if (map[next] == 0) {
                    map.remove(next)
                }
            }
            // 지금 문자의 남은 개수를 다시 맵에 넣음
            if (count - repeat > 0) {
                map[ch] = count - repeat
            }
        }
        return sb.toString()
    }
}
