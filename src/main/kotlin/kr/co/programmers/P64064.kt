package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/379
class P64064 {
    val answer = mutableSetOf<List<String>>()

    fun solution(userIds: Array<String>, bannedIds: Array<String>): Int {
        dfs(userIds, bannedIds, 0, mutableListOf())
        return answer.size
    }

    private fun dfs(userIds: Array<String>, bannedIds: Array<String>, i: Int, path: MutableList<String>) {
        if (i >= bannedIds.size) {
            answer += path.toList().sorted()
            return
        }

        for (user in userIds) {
            if (!path.contains(user) && equals(user, bannedIds[i])) {
                path += user
                dfs(userIds, bannedIds, i + 1, path)
                path.removeAt(path.lastIndex)
            }
        }
    }

    fun equals(user: String, banned: String): Boolean {
        if (user.length != banned.length) return false
        return user.zip(banned).all { it.second == '*' || it.first == it.second }
    }

}
