package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/431
class P134240 {
    fun solution(food: IntArray): String {
        for (i in 1 until food.size) {
            food[i] /= 2
        }
        val sb = StringBuilder()
        // 1 ~ 9
        for (i in 1 until food.size) {
            repeat(food[i]) { sb.append(i) }
        }
        sb.append("0") // 물
        // 9 ~ 1
        for (i in food.lastIndex downTo 1) {
            repeat(food[i]) { sb.append(i) }
        }
        return sb.toString()
    }

}
