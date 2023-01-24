package org.example;

class MySolution implements Solution {

    @Override
    public int removeElement(int[] nums, int val) {
        int maxIndex = nums.length - 1;
        for (int i = 0; i <= maxIndex;) {
            if (nums[i] == val) {
                int j = i;
                int buffer = nums[i];
                while (++j <= maxIndex) {
                    nums[j - 1] = nums[j];
                }
                nums[maxIndex] = buffer;
                maxIndex--;
            } else {
                i++;
            }
        }
        return maxIndex + 1;
    }
}
