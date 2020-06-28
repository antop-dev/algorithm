package com.leetcode


// https://leetcode.com/problems/find-the-duplicate-number/
class P287 {

    fun findDuplicate(nums: IntArray): Int {
        var tortoise = nums[0]
        var hare = nums[0]

        do {
            tortoise = nums[tortoise]
            hare = nums[nums[hare]]
        } while (tortoise != hare)

        tortoise = nums[0]
        while (tortoise != hare) {
            tortoise = nums[tortoise]
            hare = nums[hare]
        }

        return hare
    }

}
