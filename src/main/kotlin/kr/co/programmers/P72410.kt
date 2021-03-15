package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/72410
class P72410 {

    fun solution(new_id: String): String {
        var s = new_id
        s = s.toLowerCase()
        s = s.replace(Regex("[^a-z0-9-_.]"), "")
        s = s.replace(Regex("\\.{2,}"), ".")
        s = s.replace(Regex("^[.]"), "")
        s = s.replace(Regex("[.]\$"), "")
        if (s.isEmpty()) {
            s = "a"
        }
        if (s.length >= 16) {
            s = s.substring(0, 15)
            s = s.replace(Regex("[.]\$"), "")
        }
        while (s.length <= 2) {
            s += s[s.lastIndex]
        }
        return s
    }

}
