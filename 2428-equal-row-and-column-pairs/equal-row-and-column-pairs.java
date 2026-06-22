import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int equalPairs(int[][] grid) {

        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> list4 = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> list1 = new ArrayList<>();

            for (int j = 0; j < grid[0].length; j++) {

                list1.add(grid[i][j]);
            }
            list.add(list1);

        }
        for (int i = 0; i < grid.length; i++) {
            List<Integer> list1 = new ArrayList<>();

            for (int j = 0; j < grid[0].length; j++) {

                list1.add(grid[j][i]);
            }
            list4.add(list1);

        }
        int count=0;
        for (int i = 0; i < list4.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if (list4.get(i).equals(list.get(j))) {
                    count++;
                }
            }
        }
        

        return count;




    }
}