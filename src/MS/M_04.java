package MS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class M_04 {

    public static void main(String[] args) {

        solution("xxxx,male,1997-01-15");
    }

    public static ArrayList<String[]> list=new ArrayList<>();
    public static String solution(String arg1) {
        String bestMatch = null;
        // 在这⾥写代码
        String[] user=arg1.split(",");
        try {
            BufferedReader reader=new BufferedReader(new FileReader("/home/bai/zuoye/src/final_user_list.txt"));
            String read;
            while ((read=reader.readLine())!=null){
                String[] user1=read.split(",");
                if(user[1].equals(user1[1])){
                    list.add(user1);
                }
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        list.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] strings, String[] t1) {
                return strings[2].compareTo(t1[2]);
            }
        });

        Integer t;
        String[] u=new String[4];
        u[0]=list.get(0)[0];
        u[1]=list.get(0)[1];
        u[2]=list.get(0)[2];
        u[3]=String.valueOf(Integer.MAX_VALUE);
        for (int i = 0; i < list.size(); i++) {
            t=Math.abs(user[2].compareTo(list.get(i)[2]));
            if(Integer.valueOf(u[3])>t){
                u[0]=list.get(i)[0];
                u[1]=list.get(i)[1];
                u[2]=list.get(i)[2];
                u[3]=String.valueOf(t);
            }else if(Integer.valueOf(u[3])==t){
                if(u[0].compareTo(list.get(i)[0])>0){
                    u[0]=list.get(i)[0];
                    u[1]=list.get(i)[1];
                    u[2]=list.get(i)[2];
                    u[3]=String.valueOf(t);
                }
            }
        }
        bestMatch=u[0]+","+u[1]+","+u[2];
        System.out.println(bestMatch);
        return bestMatch;
    }
}
