package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/260
class P42746 {
    fun solution(numbers: IntArray): String {
        val n = numbers
            .sortedWith(Comparator { o1, o2 -> "$o2$o1".compareTo("$o1$o2") })
            .joinToString("")
        return if (n.all { it == '0' }) "0" else n
    }
}
