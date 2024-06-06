package LeetCode;

public class T_1103 {

    public static void main(String[] args) {

    }
    public static int[] distributeCandies(int candies, int num_people) {
        int[] n=new int[num_people];
        int x=1;
        int i=0;
        while (candies!=0){
            if(i==num_people)
                i=0;
            if(x>candies){
                n[i]+=candies;
                break;
            }
            n[i]+=x;
            candies-=x;
            x++;
            i++;
        }
        return n;
    }

}

