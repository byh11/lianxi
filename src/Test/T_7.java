package Test;

import java.util.Scanner;

public class T_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                b[j] = in.nextInt();
            }
            boolean[] bs = new boolean[n];
            for (int j = 0; j < bs.length; j++) {
                if(a[j]==b[j]){
                    bs[j]=true;
                }
            }
            int cz=0;
            while (true) {
                boolean b2=false;
                for (int j = 0; j < bs.length; j++) {
                    if(!bs[j]){
                        b2=false;
                        break;
                    }
                    b2=true;
                }
                if(b2){
                    break;
                }
                cz++;
                int l = 0;
                int r = 0;
                boolean lr = false;
                for (int j = 0; j < bs.length; j++) {
                    if (!lr) {
                        if (!bs[j]) {
                            l = j;
                            lr = true;
                        }
                    } else {
                        if (bs[j]) {
                            r = j - 1;
                            lr=false;
                            break;
                        }
                        if(j==bs.length-1){
                            r=j;
                            lr=false;
                        }
                    }
                }
                if(lr){
                    r=bs.length-1;
                }
                for (int j = l; j <= r; j++) {
                    if (a[j] != 0 && a[j] * 2 <= b[j]) {
                        a[j] *= 2;
                        if (a[j]==b[j]){
                            bs[j]=true;
                        }
                    }else {
                        a[j] += 1;
                        if (a[j]==b[j]){
                            bs[j]=true;
                        }
                    }
                }
            }
            System.out.println(cz);
        }
    }
}
