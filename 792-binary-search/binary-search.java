class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        int mid=n/2;
        while(lo<=hi){
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                lo=mid+1;
                mid=(lo+hi)/2;
            }
            else if(target<nums[mid]){
                hi=mid-1;
                mid=(lo+hi)/2;
            }
            
        }
        return -1;
        
    }
}