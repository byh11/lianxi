package LeetCode;

public class T_17 {
    public static int[] printNumbers(int n) {
        int x=(int) Math.pow(10,n);
        int[] a=new int[x-1];
        for (int i=1;i<x;++i){
            a[i-1]=i;
        }
        return a;
    }

    public static void main(String[] args) {
        for (int i : printNumbers(1)) {
            System.out.println(i);
        }
    }
}
