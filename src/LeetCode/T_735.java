package LeetCode;

import java.util.ArrayList;

public class T_735 {
    public static void main(String[] args) {
        int[] a={5,10,-5};
        asteroidCollision(a);

    }
    public static int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (int i=0;i<asteroids.length;++i){
            a.add(asteroids[i]);
        }
        for (int i=0;i<a.size()-1;){
            if((a.get(i)>0 && a.get(i+1)<0)){
                if(Math.abs(a.get(i))==Math.abs(a.get(i+1))){
                    a.remove(i+1);
                    a.remove(i);
                }else if(Math.abs(a.get(i))>Math.abs(a.get(i+1))){
                    a.remove(i+1);
                }else {
                    a.remove(i);
                }
                i=0;
            }else {
                i++;
            }
        }
        int[] as=new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            as[i]=a.get(i);
        }
        return as;
    }
}
