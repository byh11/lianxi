package LeetCode;

import java.util.HashMap;

public class T_2606 {

    public static void main(String[] args) {

        maximumCostSubstring("hhknkkknn","hnk",new int[]{4,-4,5});
    }

    public static int maximumCostSubstring(String s, String chars, int[] vals) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            map.put((char) ('a'-1+i),i);
        }
        for (int i = 0; i < vals.length; i++) {
            map.put(chars.charAt(i),vals[i]);
        }
        int max=Math.max(map.get(s.charAt(0)),0);
        int dp[]=new int[s.length()];
        dp[0]=Math.max(map.get(s.charAt(0)),0);
        for (int i = 1; i < s.length(); i++) {
            dp[i] = Math.max(Math.max(dp[i - 1], 0) + map.get(s.charAt(i)), 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
