package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T_1380 {

    public static void main(String[] args) {


    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min=Integer.MAX_VALUE;
            int min_j=0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    min_j=j;
                }
            }
            list.add(min);
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][min_j]>min){
                    list.remove(list.size()-1);
                    break;
                }
            }
        }
        return list;
    }
}
