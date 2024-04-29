package LeetCode;

import java.util.ArrayList;

public class T_57 {

    public static void main(String[] args) {
        insert(new int[][]{{1,5}},new int[]{2,3});

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0&&newInterval.length==0){
            return new int[][]{};
        }
        if(intervals.length==0){
            return new int[][]{newInterval};
        }
        int[][] in=new int[intervals.length+1][2];
        int x=0;
        int n=1;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0]>newInterval[0] && n!=0){
                i--;
                in[x][0]=newInterval[0];
                in[x][1]=newInterval[1];
                n=0;
            }else {
                in[x][0]=intervals[i][0];
                in[x][1]=intervals[i][1];
            }
            x++;
        }
        if(n!=0){
            in[x][0]=newInterval[0];
            in[x][1]=newInterval[1];
        }
        intervals=new int[in.length][2];
        intervals=in;
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
