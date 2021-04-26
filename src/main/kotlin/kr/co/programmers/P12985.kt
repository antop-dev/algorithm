package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/250
class P12985 {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        var x = a
        var y = b

        while (!((x % 2 == 1 && y - x == 1) || (x % 2 == 0 && x - y == 1))) {
            x = win(x)
            y = win(y)
            answer++
        }
        return answer
    }

    // 승리해서 위로 올라간다
    private fun win(n: Int) = (n / 2) + if (n % 2 != 0) 1 else 0

}
