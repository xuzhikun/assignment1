import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by xuzhi on 10/28/2016.
 */
public class TwoSums {
    public int twoSums(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                count++;
            set.add(target - nums[i]);
        }
        return count;
    }
}
