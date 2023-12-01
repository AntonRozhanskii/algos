package com.leetcode.thirty.five;

public class My_1 implements Solution {

    @Override
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        if (target <= nums[0]) {
            return 0;
        }
        int right = nums.length - 1;
        if (target > nums[right]) {
            return right + 1;
        }
        if (target == nums[right]) {
            return right;
        }

        int left = 0;
        int index;
        do {
            index = (left + right) / 2;
            if (nums[index] == target) {
                return index;
            }
            if (target > nums[index]) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        } while (left <= right);

        return left;
    }
}
