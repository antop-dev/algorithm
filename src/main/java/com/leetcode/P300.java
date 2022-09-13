package com.leetcode;

import java.util.Arrays;

// https://github.com/antop-dev/algorithm/issues/417
public class P300 {
    public int lengthOfLIS(int[] nums) {
        int[] max = new int[nums.length];
        Arrays.fill(max, 1);

        int[] dp = new int[nums.length];
        dp[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    max[i] = Math.max(max[i], max[j] + 1);
                }
            }
            dp[i] = Math.max(dp[i - 1], max[i]);
        }

        return dp[dp.length - 1];
    }
}
