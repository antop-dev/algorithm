package com.leetcode;

import java.util.Arrays;

// https://github.com/antop-dev/algorithm/issues/407
public class P445 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;

        int i = 0;
        int j = 0;
        while (i < g.length) {
            while (j < s.length) {
                if (s[j++] >= g[i]) {
                    count++;
                    break;
                }
            }
            i++;
        }

        return count;
    }
}
