package zuoye.Mcs;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    List<QueueNode> list;
    public Queue(){
        list=new ArrayList<>();
        list.add(0,new QueueNode(0));
    }
    public static Queue QUEUE=new Queue();

    public QueueNode getTail(){
        return list.get(list.size()-1);
    }

    public void add(){
        list.add(list.size(),new QueueNode(1));
    }

    public void remove(){
        list.remove(0);
        list.get(0).setLock(0);
    }

    public void dis(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("状态:"+list.get(i).getLock());
        }
    }
}
