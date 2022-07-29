package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class T_593 {
    public static void main(String[] args) {
        System.out.println(validSquare(new int[]{6987,-473},new int[]{6985,-473},new int[]{6986,-472},new int[]{6986,-474}));
    }
    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put((int) j(p1, p2, p3),0);
        map.put((int) j(p3, p4, p1),0);
        if(map.size()>1)
            return false;
        return true;
    }

    public static double j(int[] p1, int[] p2, int[] p3){
        double ab=c(p1,p2);
        double ac=c(p1,p3);
        double bc=c(p2,p3);
        return ((ab*ab+ac*ac-bc*bc)/2*ab*ac);
    }
    public static double c(int[] p1, int[] p2){
        return Math.sqrt((p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[0]-p2[0]));
    }
}
