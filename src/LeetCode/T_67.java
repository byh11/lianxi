package LeetCode;

public class T_67 {

    public static void main(String[] args) {
        addBinary("1010", "1011");

    }

    public static String addBinary(String a, String b) {
        int x1=a.length()-1;
        int x2=b.length()-1;
        String s="";
        int n=0;
        while (x1>=0 || x2>=0) {
            int m1=0,m2=0;
            if(x1>=0){
                m1=Integer.valueOf(a.charAt(x1)-'0');
            }
            if(x2>=0){
                m2=Integer.valueOf(b.charAt(x2)-'0');
            }
            int m=m1+m2+n;
            if(m ==0){
                s="0"+s;
            }else if (m==1){
                s="1"+s;
                if(n==1){
                    n=0;
                }
            }else if(m==2){
                s="0"+s;
                n=1;
            }else if(m==3){
                s="1"+s;
                n=1;
            }
            x1--;
            x2--;
        }
        if(n==1){
            s="1"+s;
        }
        return s;
    }
}
