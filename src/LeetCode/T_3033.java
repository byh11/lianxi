package LeetCode;

import java.util.ArrayList;

public class T_3033 {

    public static void main(String[] args) {
        
        
    }

    public int[][] modifiedMatrix(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            int max=matrix[0][i];
            for (int j = 1; j < matrix.length; j++) {
                if(matrix[j][i]>max){
                    max=matrix[j][i];
                }
            }
            list.add(max);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==-1){
                    matrix[i][j]=list.get(j);
                }
            }
        }
        return matrix;
    }
}
