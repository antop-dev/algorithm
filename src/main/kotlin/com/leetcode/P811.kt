package com.leetcode

// https://github.com/antop-dev/algorithm/issues/614
class P811 {
    fun subdomainVisits(cpdomains: Array<String>): List<String> {
        val map = mutableMapOf<String, Int>()
        cpdomains.forEach { domain ->
            val (count, subs) = parse(domain)
            subs.forEach { sub ->
                map[sub] = map.getOrDefault(sub, 0) + count
            }
        }
        return map.map { (domain, count) -> "$count $domain" }
    }

    private fun parse(s: String): Pair<Int, List<String>> {
        val (visits, domain) = s.split(" ")
        val subs = mutableListOf<String>()
        val sb = StringBuilder()
        for (ch in ".$domain".reversed()) {
            if (ch == '.') {
                subs += sb.toString()
            }
            sb.insert(0, ch)
        }
        return visits.toInt() to subs
    }
}
