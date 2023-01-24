package org.example;

public class TheirSolution implements Solution{

    @Override
    public int removeElement(int[] nums, int val) {
        int r = 0;
        for (int current : nums) {
            if (current != val) {
                nums[r++] = current;
            }
        }
        return r;
    }
}
