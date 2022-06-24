package com.leetcode;

import java.util.HashMap;
import java.util.Map;

// https://github.com/antop-dev/algorithm/issues/404
public class P1218 {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int num : arr) {
            int prevCount = map.getOrDefault(num - difference, 0);
            map.put(num, prevCount + 1);
            answer = Math.max(answer, prevCount + 1);
        }
        return answer;
    }
}
