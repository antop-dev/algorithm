package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/43163
class P43163 {
    private var minStep = Int.MAX_VALUE

    fun solution(begin: String, target: String, words: Array<String>): Int {
        if (target !in words) return 0
        dfs(begin, target, words, 0)
        return minStep
    }

    private fun dfs(begin: String, target: String, words: Array<String>, step: Int) {
        if (begin == target) {
            if (step < minStep) minStep = step
            return
        }
        for (word in words) {
            if (begin.zip(word).count { pair -> pair.first != pair.second } == 1) {
                val array = words.toMutableList().apply { remove(word) }.toTypedArray()
                dfs(word, target, array, step + 1)
            }
        }
    }

}
