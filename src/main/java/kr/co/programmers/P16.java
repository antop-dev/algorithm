package kr.co.programmers;

import java.util.Arrays;

// https://github.com/antop-dev/algorithm/issues/361
public class P16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int answer = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(sum - target);
                if (diff < Math.abs(target - answer)) answer = sum;
                if (sum < target) j++;
                else k--;
            }
        }
        return answer;
    }
}
