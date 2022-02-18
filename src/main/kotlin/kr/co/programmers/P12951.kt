package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/377
class P12951 {
    fun solution(s: String): String {
        val sb = StringBuilder()
        var length = 0 // 진행중인 문자열의 길이
        for (c in s) {
            var v = c
            if (c == ' ') { // 공백
                length = 0
            } else { // 공백 아님
                if (length == 0 && c in 'a'..'z') { // 첫번째 문자가 소문자인 경우
                    v -= 32 // 소문자 → 대문자
                } else if (length > 0 && c in 'A'..'Z') { // 대문자인 경우
                    v += 32 // 대문자 → 소문자
                }
                length++
            }
            sb.append(v)
        }
        return sb.toString()
    }
}
