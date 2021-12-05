package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/271
class P43165 {
    var count = 0

    fun solution(numbers: IntArray, target: Int): Int {
        dfs(numbers, target, 0, 0)
        return count
    }

    /**
     * DFS 탐색
     *
     * @param numbers 사용할 수 있는 숫자가 담긴 배열
     * @param target 타겟 넘버
     * @param i 현재 숫자의 위치 (인덱스)
     * @param sum 합계
     */
    private fun dfs(numbers: IntArray, target: Int, i: Int, sum: Int) {
        if (i >= numbers.size) {
            println(sum)
            if (sum == target) count++
            return
        }
        dfs(numbers, target, i + 1, sum + numbers[i])
        dfs(numbers, target, i + 1, sum - numbers[i])
    }
}
