package Sequential;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TaskThread extends Thread{
    public static Sequential sequential;

    public static CountDownLatch countDownLatch=new CountDownLatch(1);

    public TaskThread(){
        sequential=new Sequential();
    }

    @Override
    public void run() {
        LinkNode node;
        long time=0;
        if(sequential.getNode().getNext()==null){
            time=100000000;
        }else {
            node=sequential.getNode().getNext();
            time=node.getTime()-System.currentTimeMillis();
        }
        while (true){
            try {
                //await时间到为false
                System.out.println(1);
                sleep(1000);
                if (!countDownLatch.await(time, TimeUnit.MILLISECONDS)) {
                    System.out.println(sequential.getNode().getNext().getMap().get("123"));
                    sequential.del();
                }
                if(sequential.getNode().getNext()==null){
                    time=100000000;
                }else {
                    node=sequential.getNode().getNext();
                    time=node.getTime()-System.currentTimeMillis();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Sequential getSequential() {
        return sequential;
    }

    public void setSequential(Sequential sequential) {
        this.sequential = sequential;
    }

    public void countDown(){
        countDownLatch.countDown();
    }
}
