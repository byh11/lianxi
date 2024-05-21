package LeetCode;

public class T_1108 {

    public static void main(String[] args) {

        defangIPaddr("1.1.1.1");
    }

    public static String defangIPaddr(String address) {
//        String[] s=address.split("\\.");
//        StringBuilder sb=new StringBuilder();
//        for (int i = 0; i < s.length; i++) {
//            if(i==s.length-1){
//                sb.append(s[i]);
//            }else {
//                sb.append(s[i]+"[.]");
//            }
//        }
//        return sb.toString();
        return address.replace(".","[.]");

    }

}
