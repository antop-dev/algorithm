package com.leetcode;

import java.util.HashSet;
import java.util.Set;

// https://github.com/antop-dev/algorithm/issues/418
public class P645 {
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                answer[0] = num;
            }
        }
        for (int num = 1; num <= nums.length; num++) {
            if (!set.contains(num)) {
                answer[1] = num;
                break;
            }
        }
        return answer;
    }
}
