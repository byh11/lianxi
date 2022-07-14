package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class T_745 {
    static class WordFilter {
        HashMap<String,Integer> map=new HashMap<>();
        int n=0;
        public WordFilter(String[] words) {
            for (int i=0;i< words.length;++i){
                map.put(words[i],n++);
            }
        }

        public int f(String pref, String suff) {
            int x=-1;
            for (int i=0;i<map.size();++i){
                for (Map.Entry<String,Integer> entry: map.entrySet()) {
                    int ps=pref.length();
                    int ss=suff.length();
                    if((entry.getKey().substring(0,ps)+entry.getKey().substring(entry.getKey().length()-ss,entry.getKey().length())).equals(pref+suff)){
                        x= entry.getValue();
                    }
                }
            }
            return x;
        }
    }

    public static void main(String[] args) {
        WordFilter wordFilter=new WordFilter(new String[]{"apple"});
        System.out.println(wordFilter.f("a", "x"));
    }
}
