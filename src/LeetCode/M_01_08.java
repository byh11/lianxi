package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class M_01_08 {

    public static void main(String[] args) {
        setZeroes(new int[][]{{0,0,0,5}, {4,3,1,4}, {0,1,1,4},{1,2,1,3},{0,0,1,1}});
    }

    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(i);
                    list1.add(j);
                }
            }
        }
        int k = 0;
        for (int z = 0; z < list.size(); z++) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][list1.get(k)] = 0;
            }
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[list.get(k)][i] = 0;
            }
            k++;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
