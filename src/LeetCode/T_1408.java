package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T_1408 {
    public static List<String> stringMatching(String[] words) {
        List<String> list=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(i!=j && words[j].contains(words[i])){
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
