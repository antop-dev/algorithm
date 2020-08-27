package com.leetcode

// https://leetcode.com/problems/count-submatrices-with-all-ones/
class P1504 {
    fun numSubmat(mat: Array<IntArray>): Int {
        // For each row i, create an array nums where: if mat[i][j] == 0 then nums[j] = 0 else nums[j] = nums[j-1] +1.
        for (i in mat.indices) {
            for (j in 1 until mat[i].size) {
                mat[i][j] = if (mat[i][j] == 1) mat[i][j - 1] + 1 else 0
            }
        }

        var submatrices = 0;
        // In the row i, number of rectangles between column j and k(inclusive) and ends in row i, is equal to SUM(min(nums[j, .. idx])) where idx go from j to k.
        // Expected solution is O(n^3).
        for (i in mat.lastIndex downTo 0) {
            for (j in mat[i].indices) {
                submatrices += mat[i][j] + (0 until i).map { k ->
                    (k..i).map { idx -> mat[idx][j] }.min()!!
                }.sum()
            }
        }
        return submatrices
    }
}
