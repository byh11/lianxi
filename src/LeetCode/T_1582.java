package LeetCode;

public class T_1582 {
    public static int numSpecial(int[][] mat) {
        int a=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int x=0,y=0;
                for (int k = 0; k < mat[i].length; k++) {
                    x+=mat[i][k];
                }
                for (int k = 0; k < mat.length; k++) {
                    y+=mat[k][j];
                }
                if(mat[i][j]==1 && x==1 && y==1){
                    a++;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(numSpecial(new int[][]{{0,0}, {0,0}, {1,0}}));
    }
}
