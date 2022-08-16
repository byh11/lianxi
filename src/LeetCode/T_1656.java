package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T_1656 {

    class OrderedStream {
        HashMap<Integer,String> map=new HashMap<>();
        int n=1;
        int s;
        public OrderedStream(int n) {
            this.s=n;
        }

        public List<String> insert(int idKey, String value) {
            List<String> list=new ArrayList<>();
            map.put(idKey,value);
            if(n==idKey){
                while (map.get(n)!=null) {
                    list.add(map.get(n));
                    n++;
                }
                return list;
            }
            return list;
        }
    }

    public static void main(String[] args) {

    }
}
