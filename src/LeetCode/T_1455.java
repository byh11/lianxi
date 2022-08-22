package LeetCode;

public class T_1455 {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "bur"));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] word=sentence.split(" ");
        char[] ss=searchWord.toCharArray();
        int a=-1;
        for (int i = 0; i < word.length; i++) {
            if(word[i].contains(searchWord)){
                int x=0;
                char[] s=word[i].toCharArray();
                for (int j = 0; j < ss.length; j++) {
                    if(ss[j]==s[j]){
                        x++;
                    }
                }
                if(x==searchWord.length()){
                    a=i+1;
                    break;
                }
            }
        }
        return a;
    }
}
