package LeetCode;

import java.util.HashMap;

/**
 * @Author °×ÔÆºÆ
 * @Date 2024/7/16 17:43
 * @×¢ÊÍ
 */

public class T_2956 {

    public static void main(String[] args) {


    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int a=0,b=0;
        HashMap<Integer,Boolean> m1=new HashMap<>();
        HashMap<Integer,Boolean> m2=new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            m1.put(nums1[i],true);
        }
        for (int i = 0; i < nums2.length; i++) {
            m2.put(nums2[i],true);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (m2.containsKey(nums1[i])) {
                a++;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if(m1.containsKey(nums2[i])){
                b++;
            }
        }
        return new int[]{a,b};
    }
}
