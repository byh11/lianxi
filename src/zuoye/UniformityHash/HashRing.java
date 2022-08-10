package zuoye.UniformityHash;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashRing {
    private static final int MAX=1000000000;
    ArrayList<Integer> list=new ArrayList();
    ArrayList<ConcurrentHashMap> arrayLists=new ArrayList();
    public HashRing(ConcurrentHashMap list1){
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

    public void add(ConcurrentHashMap list1){
        for (int i = 0; i < list.size(); i+=2) {
            if(i+1>=list.size()){
                int x=(list.get(i)+MAX)/2;
                list.add(x);
                arrayLists.add(list1);
                ConcurrentHashMap l=arrayLists.get(i);
                l.forEach((key, value) -> {
//                    System.out.print(key + "-" + value + "	");
                    if((int)key>=x){
                        list1.put(key,value);
                        l.remove(key);
                    }
                });
                continue;
            }
            int x=(list.get(i)+list.get(i+1))/2;
            list.add(i+1,x);
            arrayLists.add(i+1,list1);
            ConcurrentHashMap l=arrayLists.get(i);
//            for (int j = 0; j < l.size(); j++) {
//                if((int)l.get(j)>=x){
//                    list1.add(l.get(j));
//                    l.remove(j);
//                }
//            }
            l.forEach((key, value) -> {
//                    System.out.print(key + "-" + value + "	");
                if((int)key>=x){
                    list1.put(key,value);
                    l.remove(key);
                }
            });
        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            System.out.println(arrayLists.get(i).get(0));
//        }
    }

    public void add(int b,String s){
        int a=b%MAX;
        for (int i = 0; i < list.size()-1; i++) {
            if(a>= list.get(i)&&a< list.get(i+1)){
                arrayLists.get(i).put(b,s);
            }
        }
    }

    public int get(int x){
        int a=x%MAX;
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)<=a && list.get(i+1)>a){

            }
        }
        return 0;
    }
}
