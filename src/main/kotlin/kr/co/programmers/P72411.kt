package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/386
class P72411 {
    fun solution(orders: Array<String>, course: IntArray): Array<String> {
        val answer = mutableListOf<String>()
        // 메뉴조합을 오름차순으로 정렬
        val sorted = orders.map { it.toCharArray().sorted() }
        // 메뉴별 갯수별 가능한 모든 조합을 구한다.
        val combination = mutableListOf<String>()
        for (chars in sorted) {
            for (c in course) {
                combination(combination, chars, BooleanArray(chars.size), 0, c)
            }
        }
        // 문자열의 길이별로 그룹핑
        val count = combination.groupBy { it.length }
        for (e in count) {
            // 문자열별 횟수로 그룹핑
            val g = e.value.groupingBy { it }.eachCount()
            // 2회 이상 주문되고 가장 많이 주문된 횟수를 구한다.
            var max = Int.MIN_VALUE
            for (v in g.values) {
                if (v >= 2 && v > max) max = v
            }
            // 최대 주문수가 있다면 주문된 조합을 찾는다.
            if (max != Int.MIN_VALUE) {
                g.filter { it.value == max }.forEach { (t, _) -> answer += t }
            }
        }
        // 최종 메뉴 조합도 오름차순으로 정렬해서 리턴
        return answer.sorted().toTypedArray()
    }

    private fun combination(result: MutableList<String>, arr: List<Char>, visited: BooleanArray, index: Int, r: Int) {
        if (r == 0) {
            result += arr.filterIndexed { i, _ -> visited[i] }.joinToString("")
        } else if (index == arr.size) {
            return
        } else {
            visited[index] = true // 선택하는 경우
            combination(result, arr, visited, index + 1, r - 1)

            visited[index] = false // 선택하지 않는 경우
            combination(result, arr, visited, index + 1, r)
        }
    }

}
