public class MySolution {

    public int[] twoSum(int[] nums, int target) {
        int maxRightIndex = nums.length -1;
        int maxLeftIndex = maxRightIndex - 1;
        for (int leftIndex = 0; leftIndex <= maxLeftIndex; leftIndex++) {
            int left = nums[leftIndex];
            for (int rightIndex = leftIndex + 1; rightIndex <= maxRightIndex; rightIndex++) {
                int right = nums[rightIndex];
                if (left + right == target) {
                    return new int[]{leftIndex, rightIndex};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
