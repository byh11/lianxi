package LeetCode;

public class T_14 {

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"ab","a"});

    }

    public static String longestCommonPrefix(String[] strs) {
        String s="";
        int x= strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if(strs[i].length()<x){
                x=strs[i].length();
            }
        }
        for (int i = 0; i < x; i++) {
            char a=strs[0].charAt(i);
            boolean b=true;
            for (int j = 0; j < strs.length; j++) {
                if(a!=strs[j].charAt(i)){
                    b=false;
                    break;
                }
            }
            if(b){
                s+=a;
            }else {
                break;
            }
        }
        return s;
    }
}
