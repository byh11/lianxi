package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class T_452 {

    public static void main(String[] args) {
        findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}});

    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                if (point1[1] > point2[1]) {
                    return 1;
                } else if (point1[1] < point2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        ArrayList<Integer> list = new ArrayList<>();
        list.add(points[0][0]);
        list.add(points[0][1]);
        for (int i = 1; i < points.length; i++) {
            if((points[i][0]>=list.get(list.size()-2) && points[i][0]<=list.get(list.size()-1)) ||
                    (points[i][1]>=list.get(list.size()-2) && points[i][1]<=list.get(list.size()-1)) ||
                    (points[i][0]<=list.get(list.size()-1) && points[i][1]>=list.get(list.size()-1))  ||
                    (points[i][0]<=list.get(list.size()-2) && points[i][1]>=list.get(list.size()-2))){
                if (points[i][0]>list.get(list.size()-2)){
                    list.remove(list.size()-2);
                    list.add(list.size()-1,points[i][0]);
                }
                if(points[i][1]<list.get(list.size()-1)){
                    list.remove(list.size()-1);
                    list.add(points[i][1]);
                }
            }else {
                list.add(points[i][0]);
                list.add(points[i][1]);
            }
        }

        return list.size()/2;
    }

}
