package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/363
class P81302 {

    fun solution(places: Array<Array<String>>): IntArray {
        val answer = IntArray(places.size)
        for (i in places.indices) answer[i] = place(places[i])
        return answer
    }

    private fun place(place: Array<String>): Int {
        val box = Array(9) { CharArray(9) { 'X' } }.apply {
            for (r in 0 until 5) {
                for (c in 0 until 5) {
                    this[r + 2][c + 2] = place[r][c]
                }
            }
        }

        for (r in 2 until box.size - 2) {
            for (c in 2 until box[r].size - 2) {
                if (check(box, r, c)) return 0
            }
        }
        return 1
    }

    private fun check(box: Array<CharArray>, r: Int, c: Int): Boolean {
        if (box[r][c] != 'P') return false
        return when { // box[r][c] == 'P'
            box[r - 1][c] == 'P' -> true
            box[r][c + 1] == 'P' -> true
            box[r + 1][c] == 'P' -> true
            box[r][c - 1] == 'P' -> true
            box[r - 2][c] == 'P' && box[r - 1][c] == 'O' -> true
            box[r][c + 2] == 'P' && box[r][c + 1] == 'O' -> true
            box[r + 2][c] == 'P' && box[r + 1][c] == 'O' -> true
            box[r][c - 2] == 'P' && box[r][c - 1] == 'O' -> true
            box[r - 1][c - 1] == 'P' && (box[r - 1][c] != 'X' || box[r][c - 1] != 'X') -> return true
            box[r - 1][c + 1] == 'P' && (box[r - 1][c] != 'X' || box[r][c + 1] != 'X') -> return true
            box[r + 1][c + 1] == 'P' && (box[r + 1][c] != 'X' || box[r][c + 1] != 'X') -> return true
            box[r + 1][c - 1] == 'P' && (box[r + 1][c] != 'X' || box[r][c - 1] != 'X') -> return true
            else -> false
        }
    }

}
