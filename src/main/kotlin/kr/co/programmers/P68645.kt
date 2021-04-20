package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/242
class P68645 {
    fun solution(n: Int): IntArray {
        val len = (1..n).sum()
        val box = Array(n) { Array(n) { 0 } }
        var y1 = 0 // y from
        var y2 = n - 1 // y to
        var x1 = 0 // x from
        var x2 = n - 1 // x to
        // direction % 3 == 1 -> down
        // direction % 3 == 2 -> right
        // direction % 3 == 0 -> up left
        var direction = 1
        var num = 1
        while (num <= len) {
            when (direction % 3) {
                1 -> {
                    for (y in y1..y2) box[y][x1] = num++
                    x1++
                    y1++
                }
                2 -> {
                    for (x in x1..x2) box[y2][x] = num++
                    y2--
                    x2--
                }
                0 -> {
                    var y = y2
                    var x = x2
                    while (y >= y1) box[y--][x--] = num++
                    y1++
                    x2--
                }
            }
            direction++
        }

        val answer = Array(len) { 0 }
        var i = 0
        for (y in 0 until n) {
            for (x in 0..y) answer[i++] = box[y][x]
        }

        return answer.toIntArray()
    }
}
