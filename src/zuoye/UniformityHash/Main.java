package zuoye.UniformityHash;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> list=new ConcurrentHashMap<>();
        ConcurrentHashMap<Integer,String> list1=new ConcurrentHashMap<>();
        ConcurrentHashMap<Integer,String> list2=new ConcurrentHashMap<>();
        list.put(111,"1");
        HashRing hashRing=new HashRing(list);
        hashRing.add(100000001,"2");
        hashRing.add(100000002/2,"3");
//        list1.put(222,"4");
        hashRing.add(list1);
        hashRing.add(list2);
        hashRing.add(100000004,"4");
        for (Map.Entry entry:list.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("====================");
        for (Map.Entry entry:list1.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("====================");
        for (Map.Entry entry:list2.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
