class Solution {



    public int findTargetSumWays(int[] nums, int target) {
        return calculate(nums,0,0, target);
    }

       private int calculate(int[] nums, int i, int sum, int target){
        if(i==nums.length && target == sum){
            sum=0;
            i=0;
            return 1;
        }
        else if(i==nums.length){
            sum=0;
            i=0;
            return 0;
        }
        else{
            return calculate(nums,i+1,sum+nums[i],target)+calculate(nums,i+1,sum-nums[i],target);
        }
       }

}