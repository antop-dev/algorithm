package com.leetcode

class P2491 {
    fun dividePlayers(skill: IntArray): Long {
        skill.sort()
        var ans = skill[0] * skill[skill.lastIndex] * 1L
        var i = 1
        var j = skill.size - 2
        while (i < j) {
            // 전 팀의 스킬 합과 같아야 한다.
            if (skill[i] + skill[j] != skill[i - 1] + skill[j + 1]) {
                return -1
            }
            ans += skill[i++] * skill[j--]
        }
        return ans
    }
}
