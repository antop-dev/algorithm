package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/506
class P160585 {
    fun solution(board: Array<String>): Int {
        val (oCount, oWin) = check(board, 'O')
        val (xCount, xWin) = check(board, 'X')
        return when {
            // "O"나 "X"의 개수 차이가 나면 안된다.
            oCount - xCount > 1 || xCount > oCount -> 0
            // "O"와 "X"의 개수가 같을 때, 무승부 이거나 후공인 "X"가 이겨야 된다.
            oCount == xCount && ((oWin == 0 && xWin == 0) || (oWin == 0 && xWin > 0)) -> 1
            // "O"가 "X"보다 1개만 더 많을 때, 무승부 이거나 선공인 "O"가 이겨야 된다.
            oCount > xCount && ((oWin == 0 && xWin == 0) || (oWin > 0 && xWin == 0)) -> 1
            // 나머지 경우는 비정상적인 게임
            else -> 0
        }
    }

    private fun check(b: Array<String>, ch: Char): IntArray {
        val check = intArrayOf(0, 0)
        // 개수
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (b[i][j] == ch) {
                    check[0]++
                }
            }
        }
        // 가로줄
        if (b[0][0] == ch && b[0][1] == ch && b[0][2] == ch) check[1]++
        if (b[1][0] == ch && b[1][1] == ch && b[1][2] == ch) check[1]++
        if (b[2][0] == ch && b[2][1] == ch && b[2][2] == ch) check[1]++
        // 세로중
        if (b[0][0] == ch && b[1][0] == ch && b[2][0] == ch) check[1]++
        if (b[0][1] == ch && b[1][1] == ch && b[2][1] == ch) check[1]++
        if (b[0][2] == ch && b[1][2] == ch && b[2][2] == ch) check[1]++
        // 대각선
        if (b[0][0] == ch && b[1][1] == ch && b[2][2] == ch) check[1]++
        if (b[0][2] == ch && b[1][1] == ch && b[2][0] == ch) check[1]++

        return check
    }
}
