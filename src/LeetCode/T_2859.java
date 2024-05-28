package likou;

import java.util.List;

public class T_2859 {

    public static void main(String[] args) {


    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int x=0;
        for (int i = 0; i < nums.size(); i++) {
            String binary = Integer.toBinaryString(i);
            int n=0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j)=='1'){
                    n++;
                }
            }
            if (n==k){
                x+=nums.get(i);
            }
        }
        return x;
    }
}
