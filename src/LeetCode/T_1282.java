package LeetCode;

import java.util.*;

public class T_1282 {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        int[] a=new int[groupSizes.length];
        for (int i = 0; i < a.length; i++) {
            a[i]=i;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(groupSizes[i]>groupSizes[j]){
                    int t=groupSizes[i];
                    groupSizes[i]=groupSizes[j];
                    groupSizes[j]=t;
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }


        List<List<Integer>> list=new ArrayList();
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            list1.add(a[i]);
            if(list1.size()==groupSizes[i]){
                list.add(list1);
                list1=new ArrayList<>();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(groupThePeople(new int[]{3,3,3,3,3,1,3}));
    }
}
