package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/672
class P388353 {
    fun solution(storage: Array<String>, requests: Array<String>): Int {
        // ' ': 출고
        val box = storage.map { it.toCharArray() }
        for (r in requests) {
            val ch = r[0]
            when (r.length) {
                1 -> forklift(box, ch) // 지게차
                2 -> crane(box, ch) // 크레인
            }
        }
        // 출고되지 않은 컨테이너 수를 센다.
        return box.sumOf { it.count { ch -> ch != ' ' } }
    }

    private fun crane(box: List<CharArray>, ch: Char): Int {
        var count = 0
        for (i in box.indices) {
            for (j in box[i].indices) {
                if (box[i][j] == ch) {
                    box[i][j] = ' '
                    count++
                }
            }
        }
        return count
    }

    private fun forklift(box: List<CharArray>, ch: Char) {
        val n = box.size
        val m = box[n - 1].size
        val visited = Array(n) { BooleanArray(m) }
        for (j in 0 until m) { // 위, 아래
            dfs(box, 0, j, ch, visited)
            dfs(box, n - 1, j, ch, visited)
        }
        for (i in 1 until n - 1) { // 왼쪽, 오른쪽
            dfs(box, i, 0, ch, visited)
            dfs(box, i, m - 1, ch, visited)
        }
    }

    private fun dfs(
        box: List<CharArray>,
        i: Int,
        j: Int,
        ch: Char,
        visited: Array<BooleanArray>
    ) {
        if (i !in box.indices || j !in box[i].indices || visited[i][j]) {
            return
        }

        visited[i][j] = true

        when (box[i][j]) {
            ch -> box[i][j] = ' '
            ' ' -> {
                dfs(box, i - 1, j, ch, visited) // 위
                dfs(box, i, j + 1, ch, visited) // 오른쪽
                dfs(box, i + 1, j, ch, visited) // 아래
                dfs(box, i, j - 1, ch, visited) // 왼쪽
            }
        }
    }
}