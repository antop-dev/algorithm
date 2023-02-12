package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/465
class P154540 {
    fun solution(maps: Array<String>): IntArray {
        val box = maps.map { StringBuilder(it) }
        val answer = mutableListOf<Int>()
        // DFS
        for (y in box.indices) {
            for (x in box[y].indices) {
                if (box[y][x] in '1'..'9') {
                    answer += dfs(box, y, x)
                }
            }
        }
        if (answer.isEmpty()) answer += -1
        return answer.sorted().toIntArray()
    }

    private fun dfs(box: List<StringBuilder>, y: Int, x: Int): Int {
        // 좌표가 넘처기나 'X' 지역이면 0 리턴
        if (y !in 0..box.lastIndex
            || x !in 0..box[y].lastIndex
            || box[y][x] == 'X'
        ) return 0

        val v = box[y][x] - '0' // '1' → 1
        box[y][x] = 'X'
        return v +
                dfs(box, y - 1, x) +
                dfs(box, y, x + 1) +
                dfs(box, y + 1, x) +
                dfs(box, y, x - 1)
    }
}
