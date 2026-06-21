import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if(set.contains(nums1[i])){
                continue;
            }
            else{
                set.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set1.contains(nums2[i])){
                continue;
            }
            else{
                set1.add(nums2[i]);
            }
        }
        List<Integer> row1 = new ArrayList<>();
        for (Integer num : set1) {
            if(!set.contains(num)){
                row1.add(num);
            }
        }
        List<Integer> row2 = new ArrayList<>();
        for (Integer num : set) {
            if(!set1.contains(num)){
                row2.add(num);
            }
        }
        res.add(row2);
        res.add(row1);
        return res;

    }
}