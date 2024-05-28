package likou;

import java.util.ArrayList;
import java.util.List;

public class T_2951 {

    public static void main(String[] args) {


    }

    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> list=new ArrayList<>();
        boolean b=mountain[1]>mountain[0];
        for (int i = 1; i < mountain.length-1; i++) {
            if (b){
                if(mountain[i]>mountain[i+1]){
                    if(mountain[i]!=mountain[i-1]){
                        list.add(i);
                    }
                    b=false;
                }
            }else{
                if(mountain[i]<mountain[i+1]){
                    b=true;
                }
            }
        }
        return list;
    }
}
