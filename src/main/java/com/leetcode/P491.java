package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://github.com/antop-dev/algorithm/issues/399
public class P491 {
    private Set<List<Integer>> answer = new HashSet<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> pool = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            dfs(pool, nums, i);
        }
        return new ArrayList<>(answer);
    }

    private void dfs(List<Integer> pool, int[] nums, int i) {
        if (nums.length == i) return;
        if (!pool.isEmpty() && nums[i] < pool.get(pool.size() - 1)) return;

        pool.add(nums[i]);

        if (pool.size() >= 2) {
            answer.add(new ArrayList<>(pool));
        }

        for (int j = i + 1; j < nums.length; j++) {
            dfs(pool, nums, j);
        }

        pool.remove(pool.size() - 1);
    }

}
