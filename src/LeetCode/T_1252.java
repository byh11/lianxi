package LeetCode;

public class T_1252 {
    public static void main(String[] args) {
        int [][] a={{0,0},{1,1}};
        System.out.println(oddCells(2, 2, a));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int s=0;
        int[][] a=new int[m][n];
        for (int i=0;i< indices.length;++i){
            int x=indices[i][0];
            for (int p=0;p<n;++p){
                a[x][p]++;
            }
            x=indices[i][1];
            for (int p=0;p<m;++p){
                a[p][x]++;
            }
        }
        for (int i=0;i<m;++i){
            for (int p=0;p<n;++p){
                System.out.println(a[i][p]);
                if(a[i][p]%2!=0)
                    s++;
            }
        }
        return s;
    }
}
