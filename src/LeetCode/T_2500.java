package LeetCode;

import java.util.Arrays;

public class T_2500 {

    public static void main(String[] args) {

        deleteGreatestValue(new int[][]{{1,2,4},{3,3,1}});
    }

    public static int deleteGreatestValue(int[][] grid) {
        int x=0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        for (int i = grid[0].length-1; i >=0 ; i--) {
            int max=0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i]>max){
                    max=grid[j][i];
                }
            }
            x+=max;
        }
        return x;
    }
}
