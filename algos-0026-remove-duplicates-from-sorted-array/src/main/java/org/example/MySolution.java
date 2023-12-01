package org.example;

class MySolution {

    public int[] removeDuplicates(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num > nums[index]) {
                index++;
                nums[index] = num;
            }
        }
        return nums;
    }
}
