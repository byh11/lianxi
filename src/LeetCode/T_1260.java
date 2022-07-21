package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T_1260 {
    public static void main(String[] args) {
        List<List<Integer>> list=shiftGrid(new int[][]{{1,2,3},{4,5,6},{7,8,9}},1);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+"----");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list=new ArrayList<>();
        int i1=0,j1=0,t=0;
        for(int p=0;p<k;++p) {
            if(j1==0){
                j1=grid[0].length;
                if(i1==0){
                    i1= grid.length;
                }
                i1--;
            }
            j1--;
        }
        int n=0;
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                list1.add(t++,grid[i1][j1]);
                System.out.println(grid[i1][j1]);
                if(t==grid[i].length){
                    list.add(list1);
                    list1=new ArrayList<>();
                    t=0;
                }
                j1++;
                if(j1==grid[i].length){
                    j1=0;
                    i1++;
                    if(i1== grid.length){
                        i1=0;
                    }
                }
            }
        }
        return list;
    }
}
