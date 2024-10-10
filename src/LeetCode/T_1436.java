package LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T_1436 {

    public static void main(String[] args) {

    }

    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map=new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            map.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        String a=paths.get(0).get(0);
        while (true){
            if(map.containsKey(a)){
                a=map.get(a);
            }else {
                return a;
            }
        }
    }
}
