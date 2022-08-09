package UniformityHash;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashRing {
    private static final int MAX=1000000000;
    ArrayList<Integer> list=new ArrayList();
    ArrayList<CopyOnWriteArrayList> arrayLists=new ArrayList();
    public HashRing(CopyOnWriteArrayList list1){
        list.add(0);
        arrayLists.add(list1);
        list.add((int) (MAX*0.2));
        arrayLists.add(list1);
        list.add((int) (MAX*0.4));
        arrayLists.add(list1);
        list.add((int) (MAX*0.6));
        arrayLists.add(list1);
        list.add((int) (MAX*0.8));
        arrayLists.add(list1);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }

    public void add(CopyOnWriteArrayList list1){
        for (int i = 0; i < list.size(); i+=2) {
            if(i+1>=list.size()){
                list.add(((list.get(i)+MAX)/2));
                arrayLists.add(list1);
                List l=arrayLists.get(i);
                int x=(list.get(i)+list.get(i+1))/2;
                for (int j = 0; j < l.size(); j++) {
                    if((int)l.get(j)>=x){
                        l.remove(j);
                        list1.add(l.get(j));
                    }
                }
                continue;
            }
            list.add(i+1,((list.get(i)+list.get(i+1))/2));
            arrayLists.add(i+1,list1);
            List l=arrayLists.get(i);
            int x=(list.get(i)+list.get(i+1))/2;
            for (int j = 0; j < l.size(); j++) {
                if((int)l.get(j)>=x){
                    l.remove(j);
                    list1.add(l.get(j));
                }
            }
        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            System.out.println(arrayLists.get(i).get(0));
//        }
    }

    public void  add(int b){
        int a=b%MAX;
        for (int i = 0; i < list.size()-1; i++) {
            if(a>= list.get(i)&&a< list.get(i+1)){
                arrayLists.get(i).add(b);
            }
        }
    }
}
