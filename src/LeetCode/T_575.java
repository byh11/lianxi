package LeetCode;

import java.util.HashMap;

public class T_575 {
    public static void main(String[] args) {


    }

    public static int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < candyType.length; i++) {
            if(map.size()>=n){
                break;
            }
            if(!map.containsKey(candyType[i])){
                map.put(candyType[i],candyType[i]);
            }
        }
        return map.size();
    }
}
