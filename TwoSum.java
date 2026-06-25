import java.util.ArrayList;
import java.util.List;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}