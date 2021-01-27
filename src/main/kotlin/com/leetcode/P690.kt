package com.leetcode

// https://leetcode.com/problems/employee-importance/
class P690 {
    fun getImportance(employees: List<Employee?>, id: Int): Int {
        val hash = mutableMapOf<Int, Employee>()
        for (e in employees) e?.run { hash[this.id] = this }

        val queue = mutableListOf<Employee>()
        hash[id]?.run { queue += this }

        var ans = 0
        while (queue.isNotEmpty()) {
            val e = queue.removeAt(0)
            ans += e.importance
            for (n in e.subordinates) hash[n]?.run { queue += this }
        }

        return ans
    }

    class Employee {
        var id: Int = 0
        var importance: Int = 0
        var subordinates: List<Int> = listOf()
    }
}

