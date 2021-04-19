package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/240
class P68936 {
    val answer: IntArray = intArrayOf(0, 0)

    fun solution(arr: Array<IntArray>): IntArray {
        recursive(arr, 0, 0, arr.size)
        return answer
    }

    private fun recursive(arr: Array<IntArray>, y: Int, x: Int, size: Int) {
        val count = intArrayOf(0, 0)
        for (i in y until y + size) {
            for (j in x until x + size) {
                if (arr[i][j] == 0) count[0]++ else count[1]++
            }
        }
        when {
            count[0] == size * size -> answer[0]++
            count[1] == size * size -> answer[1]++
            size == 2 -> {
                answer[0] += count[0]
                answer[1] += count[1]
            }
            else -> {
                val half = size / 2
                var i = y
                while (i < y + size) {
                    var j = x
                    while (j < x + size) {
                        recursive(arr, i, j, half)
                        j += half
                    }
                    i += half
                }
            }
        }

    }

}
