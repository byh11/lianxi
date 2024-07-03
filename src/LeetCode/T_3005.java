package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class T_3005 {

    public static void main(String[] args) {

        maxFrequencyElements(new int[]{1,2,3,4,5});
    }

    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int[] n=new int[map.size()];
        int i=0;
        for(int v:map.values()){
            n[i++]=v;
        }
        Arrays.sort(n);
        int m=0;
        int max=n[n.length-1];
        for (int j = n.length-1; j >= 0; j--) {
            if(max==n[j]){
                m+=n[j];
            }else {
                break;
            }
        }
        return m;
    }
}
