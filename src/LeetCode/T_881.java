package LeetCode;


import java.util.*;

public class T_881 {
    //    public static int numRescueBoats(int[] people, int limit) {
//        int n=0,x=0;
//        List list=new ArrayList<>(Arrays.asList(people));
//        for (int i = 0; i < people.length; i++) {
//            list.add(people[i]);
//        }
//        list.sort(Comparator.reverseOrder());
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i)<limit){
//                for (int j = i+1; j < list.size(); j++) {
//                    if ((list.get(i)+list.get(j)<=limit)){
//                        n++;
//                        list.remove(j);
//                        list.remove(i);
//                        i--;
//                        x++;
//                        break;
//                    }
//                }
//                if(x==0){
//                    n++;
//                    list.remove(i);
//                    i--;
//                }
//                x=0;
//            }else {
//                n++;
//                list.remove(i);
//                i--;
//            }
//        }
//        return n;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(numRescueBoats(new int[]{3, 8, 7, 1, 4}, 9));
//    }
//
//    public static int numRescueBoats(int[] people, int limit) {
//
//    }
}