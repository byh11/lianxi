package LeetCode;

public class T_2903 {

    public static void main(String[] args) {
        
        
    }

    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        if(indexDifference==0&&valueDifference==0){
            return new int[]{0,0};
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(Math.abs(i-j) >= indexDifference && Math.abs(nums[i]-nums[j]) >= valueDifference){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
