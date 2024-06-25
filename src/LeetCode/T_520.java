package LeetCode;

public class T_520 {

    public static void main(String[] args) {

        detectCapitalUse("FFFf");
    }

    public static boolean detectCapitalUse(String word) {
        String[] s = word.split(" ");
        for (int i = 0; i < s.length; i++) {
            boolean b=false;
            if (s[i].charAt(0) >= 'A' && s[i].charAt(0) <= 'Z') {
                b=true;
            }
            for (int j = 1; j < s[i].length(); j++) {
                if (b){
                    if(s[i].charAt(j)>='A' && s[i].charAt(j)<='Z'){

                    }else {
                        if(j==1){
                            b=false;
                        }else {
                            return false;
                        }
                    }
                }else {
                    if(s[i].charAt(j)>='A' && s[i].charAt(j)<='Z'){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
