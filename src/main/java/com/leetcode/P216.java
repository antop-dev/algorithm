package com.leetcode;

import java.util.ArrayList;
import java.util.List;

// https://github.com/antop-dev/algorithm/issues/432
public class P216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, k, n, 0, new ArrayList<>());
        return result;
    }

    private void dfs(List<List<Integer>> result, int k, int n, int last, List<Integer> pool) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(pool));
            return;
        }
        for (int num = last + 1; num <= 9; num++) {
            pool.add(num);
            dfs(result, k - 1, n - num, num, pool);
            pool.remove(pool.size() - 1); // backtracking
        }
    }
}
