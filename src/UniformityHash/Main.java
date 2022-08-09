package UniformityHash;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Integer> list1=new CopyOnWriteArrayList<>();
        list.add(111);
        HashRing hashRing=new HashRing(list);
        list1.add(222);
        hashRing.add(100000001);
        hashRing.add(list1);
        hashRing.add(333);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===================");
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }
    }
}
