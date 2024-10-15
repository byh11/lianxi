package Test;

import java.util.HashMap;
import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[][] ns = new int[n][2];
        int[][] ks = new int[k][2];
        for (int i = 0; i < n; i++) {
            ns[i][0] = in.nextInt();
            ns[i][1] = in.nextInt();
        }
        for (int i = 0; i < k; i++) {
            ks[i][0] = in.nextInt();
            ks[i][1] = in.nextInt();
        }
        int max=c(ns,ks,m,0,0,new HashMap<>(),0);
        System.out.println(max);
    }

    public static int c(int[][] ns, int[][] ks, int ms, int n, int m, HashMap<Integer, Integer> map, int v) {
        if (m >= ms || n == ns.length) {
            return v;
        }
        for (int i = n; i < ns.length; i++) {
            boolean b = false;
            for (int j = 0; j < ks.length; j++) {
                if (i + 1 == ks[j][0]) {
                    if (map.containsValue(ks[j][1])) {
                        b = true;
                        break;
                    }
                }
                if (i + 1 == ks[j][1]) {
                    if (map.containsKey(ks[j][0])) {
                        b = true;
                        break;
                    }
                }
            }
            if (b) {
                b=false;
                continue;
            }
            m += ns[i][0];
            v += ns[i][1];
            map.put(i + 1, i + 1);
            int v1 = c(ns, ks, ms, ++n, m, map, v);
            if (v < v1) {
                m -= ns[i][0];
                v -= ns[i][1];
                map.replace(i + 1, i + 1);
            }else {
                v=v1;
            }
        }
        return v;
    }
}
