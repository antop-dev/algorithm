package com.leetcode;

import java.util.HashSet;
import java.util.Set;

// https://github.com/antop-dev/algorithm/issues/430
public class P1593 {

    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();
        return dfs(set, s, 0);
    }

    private int dfs(Set<String> set, String s, int pos) {
        if (pos >= s.length()) {
            return set.size();
        }

        int max = set.size();
        for (int i = pos; i < s.length(); i++) {
            String substring = s.substring(pos, i + 1);
            if (set.add(substring)) {
                max = Math.max(max, dfs(set, s, i + 1));
                set.remove(substring); // backtracking
            }
        }

        return max;
    }

}
