package LeetCode;

import java.util.ArrayList;

public class T_56 {

    public static void main(String[] args) {
        merge(new int[][]{{1,4},{0,5}});


    }

    public static int[][] merge(int[][] intervals) {
        if(intervals.length==0){
            return new int[][]{};
        }
        int[] a = new int[2];
        for (int i = 0; i < intervals.length-1; i++) {
            for (int j = i+1; j < intervals.length; j++) {
                if(intervals[i][0]>intervals[j][0]){
                    a=intervals[j];
                    intervals[j]=intervals[i];
                    intervals[i]=a;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(intervals[0][0]);
        list.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if((intervals[i][0]>=list.get(list.size()-2) && intervals[i][0]<=list.get(list.size()-1)) ||
                    (intervals[i][1]>=list.get(list.size()-2) && intervals[i][1]<=list.get(list.size()-1)) ||
                    (intervals[i][0]<=list.get(list.size()-1) && intervals[i][1]>=list.get(list.size()-1))  ||
                    (intervals[i][0]<=list.get(list.size()-2) && intervals[i][1]>=list.get(list.size()-2))

            ){
                if (intervals[i][0]<list.get(list.size()-2)){
                    list.remove(list.size()-2);
                    list.add(list.size()-1,intervals[i][0]);
                }
                if(intervals[i][1]>list.get(list.size()-1)){
                    list.remove(list.size()-1);
                    list.add(intervals[i][1]);
                }
            }else {
                list.add(intervals[i][0]);
                list.add(intervals[i][1]);
            }
        }
        int[][] res = new int[list.size()/2][2];
        for (int i = 0; i < list.size()/2; i++) {
            res[i][0] = list.get(i*2);
            res[i][1] = list.get(i*2+1);
        }
        return res;
    }
}
