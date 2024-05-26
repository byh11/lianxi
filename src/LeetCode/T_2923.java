package LeetCode;

import java.util.ArrayList;

public class T_2923 {

    public static void main(String[] args) {


    }

    public static int findChampion(int[][] grid) {
        int index=0,max=0;
        for (int i = 0; i < grid.length; i++) {
            int x=0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    x++;
                }
            }
            if(x>max) {
                max = x;
                index = i;
            }
        }
        return index;
    }
}

