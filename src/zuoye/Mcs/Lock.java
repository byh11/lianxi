package zuoye.Mcs;

public class Lock {
    public Lock(){

    }
    public static final Lock LOCK=new Lock();
    public synchronized void lock(){
        QueueNode queueNode=Queue.QUEUE.getTail();
        Queue.QUEUE.add();
        while (queueNode.getLock()!=0){
            System.out.println(1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void unlock(){
        Queue.QUEUE.remove();
    }
}
