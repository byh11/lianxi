package Test;

import java.util.Scanner;

public class T_22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                a[i] = in.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[i] = in.nextInt();
            }
            boolean up = true;
            boolean down = true;
            int[] upNum = new int[n];
            int[] downNum = new int[n];
            upNum[0] = Math.min(a[0], b[0]);
            downNum[0] = Math.max(a[0], b[0]);
            for (int j = 1; j < n; j++) {
                if(up) {
                    if (a[j] >= upNum[j - 1] && b[j] >= upNum[j - 1]) {
                        upNum[j] = Math.min(a[j], b[j]);
                    } else if (a[j] >= upNum[j - 1]) {
                        upNum[j] = a[j];
                    } else if (b[j] >= upNum[j - 1]) {
                        upNum[j] = b[j];
                    } else {
                        up = false;
                    }
                }

                if(down) {
                    if (a[j] <= downNum[j - 1] && b[j] <= downNum[j - 1]) {
                        downNum[j] = Math.max(a[j], b[j]);
                    } else if (a[j] <= downNum[j - 1]) {
                        downNum[j] = a[j];
                    } else if (b[j] <= downNum[j - 1]) {
                        downNum[j] = b[j];
                    } else {
                        down = false;
                    }
                }
                if (up == false && down == false) {
                    break;
                }
            }
            if (up || down) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
