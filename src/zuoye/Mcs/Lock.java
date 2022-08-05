package zuoye.Mcs;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public class Lock {
    private static AtomicBoolean a=new AtomicBoolean(true);
    public Lock(){

    }
    Semaphore semaphore = new Semaphore(1);
    public static final Lock LOCK=new Lock();
    public void lock() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        QueueNode queueNode = Queue.QUEUE.getTail();
        Queue.QUEUE.add();
        semaphore.release();
        while (queueNode.getLock() != 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void unlock(){
        Queue.QUEUE.remove();
        Queue.QUEUE.dis();
    }
}
