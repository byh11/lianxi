package LeetCode;

public class T_565 {
    public static void main(String[] args) {
        System.out.println(arrayNesting(new int[]{0,2,1}));
    }
    public static int arrayNesting(int[] nums) {
        int s=0;
        int a[]=new int[nums.length];
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            int x=0;
            i=j;
            while (true){
                a[i]=1;
                i=nums[i];
                x++;
                if(a[i]==1){
                    break;
                }
            }
            s=Math.max(s,x);
        }
        return s;
    }
}
