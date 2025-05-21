package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/654
class P77886 {
    fun solution(s: Array<String>): Array<String> {
        return s.map { move(it) }.toTypedArray()
    }

    private fun move(s: String): String {
        val ans = StringBuilder()
        val oneOneZero = StringBuilder()

        var zero = -1 // 가장 뒤에 있는 '0'의 위치
        for (ch in s) {
            if (ch == '0' && ans.length >= 2 &&
                ans[ans.lastIndex - 1] == '1' &&
                ans[ans.lastIndex] == '1'
            ) { // '110'이면
                ans.setLength(ans.length - 2)
                oneOneZero.append("110")
            } else {
                ans.append(ch)
                // 마지막 '0'의 위치 기억
                if (ch == '0') {
                    zero = ans.lastIndex
                }
            }

            println("| '$ch' | \"$ans\" | \"$oneOneZero\" | $zero |")
        }

        if (zero != -1) {
            ans.insert(zero + 1, oneOneZero)
        } else { // 남은 문자열 중에 '0'이 하나도 없는 경우
            ans.insert(0, oneOneZero)
        }

        return ans.toString()
    }
}