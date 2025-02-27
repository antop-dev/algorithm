package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/630
class P1947 {
    fun maxCompatibilitySum(students: Array<IntArray>, mentors: Array<IntArray>): Int {
        val visited = BooleanArray(students.size)
        return dfs(students, mentors, visited, 0, 0)
    }

    private fun dfs(
        students: Array<IntArray>,
        mentors: Array<IntArray>,
        visited: BooleanArray,
        pos: Int,
        score: Int
    ): Int {
        if (pos >= students.size) {
            return score
        }
        var max = 0
        for (i in mentors.indices) {
            if (!visited[i]) {
                visited[i] = true
                val v = dfs(students, mentors, visited, pos + 1, score + score(students[pos], mentors[i]))
                max = maxOf(max, v)
                visited[i] = false
            }

        }
        return max
    }

    private fun score(student: IntArray, mentor: IntArray): Int {
        return student.zip(mentor)
            .map { (a, b) -> if (a == b) 1 else 0 }
            .sum()
    }
}
