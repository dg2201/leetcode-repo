import java.util.HashMap;

class Solution {
    HashMap<Long, Integer> memo = new HashMap<>();
    int method(int length,int breadth ,int[][] nums) {
        if (breadth > nums.length-1 || length > nums[0].length-1) return 0;  // bounds first
        if (nums[breadth][length] == 1) return 0;                            // obstacle
        if (breadth == nums.length-1 && length == nums[0].length-1) return 1;
        long key = (long) length * 100001L + breadth;
        if (memo.containsKey(key)) return memo.get(key);
        int s=method(length,breadth+1,nums);
        int k=method(length+1,breadth,nums);
        int sum=s+k;

        memo.put(key, sum);
        return sum;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int length=0;
        int breadth=0;
        return method(length,breadth,obstacleGrid);

    }
}