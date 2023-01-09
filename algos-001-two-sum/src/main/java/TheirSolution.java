import java.util.HashMap;
import java.util.Map;

public class TheirSolution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int maxIndex = nums.length - 1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= maxIndex; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
