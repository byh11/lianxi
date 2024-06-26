package LeetCode;

public class T_1694 {

    public static void main(String[] args) {

        reformatNumber("1-23-45 6");
    }

    public static String reformatNumber(String number) {
        number=number.replace("-", "");
        number=number.replace(" ","");
        String s="";
        for (int i = 0; i < number.length(); ) {
            if(number.length()-i<=4){
                if(number.length()-i==4){
                    s+=number.substring(i,i+2);
                    s+="-";
                    s+=number.substring(i+2);
                    break;
                }else {
                    s+=number.substring(i);
                    break;
                }
            }else {
                s+=number.substring(i,i+3)+"-";
                i+=3;
            }
        }
        return s;
    }
}
