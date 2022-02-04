package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/371
class P42842 {
    fun solution(brown: Int, yellow: Int): IntArray {
        val answer = IntArray(2)

        val size = brown + yellow
        for (width in size downTo 1) {
            if (size % width > 0) continue
            val height = size / width
            if ((width - 2) * (height - 2) == yellow) {
                answer[0] = width
                answer[1] = height
                break
            }
        }

        return answer
    }
}
