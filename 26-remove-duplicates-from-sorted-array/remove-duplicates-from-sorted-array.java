class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[j]==nums[i]){
                continue;
            }
            else{
                j++;
                nums[j]=nums[i];
                count++;

            }
        }
        return count;
        
    }
}