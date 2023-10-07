package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/240
class P68936 {

    fun solution(arr: Array<IntArray>): IntArray {
        return recursive(arr, 0, 0, arr.size)
    }

    private fun recursive(arr: Array<IntArray>, y: Int, x: Int, size: Int): IntArray {
        val count = intArrayOf(0, 0);
        val n = y + size
        val m = x + size
        // 시작위치 ~ 크기만큼 0과 1의 개수를 카운트
        var zero = 0
        var one = 0
        for (i in y until n) {
            for (j in x until m) {
                if (arr[i][j] == 0) zero++ else one++
            }
        }
        when {
            // 모두 0인 경우
            zero == size * size -> count[0]++
            // 모두 1인 경우
            one == size * size -> count[1]++
            // 최소 크기인 경우
            size == 2 -> {
                count[0] += zero
                count[1] += one
            }
            // 범위를 반으로 줄여서 다시 카운팅
            else -> {
                val half = size / 2
                for (i in y until n step half) {
                    for (j in x until m step half) {
                        val (z, o) = recursive(arr, i, j, half)
                        count[0] += z
                        count[1] += o
                    }
                }
            }
        }
        // 카운팅을 위로 올린다.
        return count
    }

}
