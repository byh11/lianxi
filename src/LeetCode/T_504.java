package LeetCode;

public class T_504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(8));
    }
    public static String convertToBase7(int num) {
        String a="";
        int b=1;
        int s=0,c=0;
        while (true){
            c=num%7;
            s+=c*b;
            b*=10;
            num-=c;
            if(num/7==0){
                break;
            }
            num=num/7;
        }
        a=String.valueOf(s);
        return a;
    }
}
