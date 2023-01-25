package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/455
class P67258 {
    fun solution(gems: Array<String>): IntArray {
        // ["AA", "AB", "AC", "AA", "AC"]
        // [  0,    1,    2,    0,    2 ]
        val map = mutableMapOf<String, Int>()
        val list = mutableListOf<Int>()
        var i = 0
        for (gem in gems) {
            val idx = map[gem] ?: i++
            map[gem] = idx
            list += idx
        }
        val counter = IntArray(i)
        counter[list[0]]++

        // 계산하기
        var count = 1
        var from = 0
        var to = 0
        // [가장 짧은 구간 길이, 시작 진열대 번호, 끝 진열대 번호]
        val min = intArrayOf(gems.size, 1, gems.size)

        while (from < gems.size) {
            if (count < counter.size) { // 모든 물건을 사지 않았다
                if (to < list.lastIndex) { // to + 1
                    to++
                    counter[list[to]]++
                    if (counter[list[to]] == 1) {
                        count++
                    }
                } else { // from + 1
                    counter[list[from]]--
                    if (counter[list[from]] == 0) {
                        count--
                    }
                    from++
                }
            } else { // 모든 물건을 샀다
                if (to - from + 1 < min[0]) {
                    min[0] = to - from + 1
                    min[1] = from + 1
                    min[2] = to + 1
                }
                // 완성된 크기가 고유한 물건의 크기와 일치하면 바로 종료
                if (min[0] == counter.size) break

                counter[list[from]]--
                if (counter[list[from]] == 0) {
                    count--
                }
                from++
            }
        }

        return intArrayOf(min[1], min[2])
    }
}
