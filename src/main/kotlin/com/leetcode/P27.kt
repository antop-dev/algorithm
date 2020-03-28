package com.leetcode

// https://leetcode.com/problems/remove-element/
class P27 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        println("Given nums = ${nums.contentToString()}, val = $`val`")
        var c = 0
        var i = 0
        for (n in nums) {
            if (n != `val`) {
                nums[i] = n
                i++
                c++
            }
        }
        println("Your function should return length = $c," +
                " with elements of nums containing ${nums.speech(c)}.")
        return c;
    }

    private fun IntArray.speech(len: Int): String {
        if (len == 2) {
            return "${this[0]}, ${this[1]}"
        }
        val sb = StringBuilder()
        for (i in 0 until len) {
            if (i == len - 1) sb.append(" and ")
            else if (i > 0) sb.append(", ")
            sb.append(this[i])
        }
        return sb.toString()
    }
}