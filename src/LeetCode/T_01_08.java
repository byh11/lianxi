package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class T_01_08 {
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        for (int k=0;k<list.size();) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[list.get(0)][i]=0;
            }
            list.remove(0);
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][list.get(0)]=0;
            }
            list.remove(0);
        }
        System.out.println("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
}
