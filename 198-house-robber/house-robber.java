import java.util.HashMap;

class Solution {
    int skip=0;
    int take=0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        return robFrom(nums, 0);
    }

    private int robFrom(int[] nums, int i) {
        if (i >= nums.length) {
            return 0; // ran out of houses, nothing to add
        }
        if(map.containsKey(i)){
            return map.get(i);
        }
        else{
            int skip = robFrom(nums, i + 1);
            int take = nums[i] + robFrom(nums, i + 2);
            map.put(i, Math.max(skip, take));
            return Math.max(skip, take);
        }
        
        
    }
}