package LeetCode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T_2224 {
    public static int convertTime(String current, String correct) {
        int a=0;
        String[] old=current.split(":");
        String[] New=correct.split(":");
        int oldH=Integer.valueOf(old[0]);
        int oldM=Integer.valueOf(old[1]);
        int newH=Integer.valueOf(New[0]);
        int newM=Integer.valueOf(New[1]);
        int o=oldH*60+oldM;
        int n=newH*60+newM;
        int c=n-o;
        while (c!=0){
            if(c-60>=0){
                c-=60;
                a++;
            }else if (c-15>=0){
                c-=15;
                a++;
            }else if(c-5>=0){
                c-=5;
                a++;
            }else if(c-1>=0){
                c-=1;
                a++;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        System.out.println(convertTime("02:30","04:35"));
    }
}
