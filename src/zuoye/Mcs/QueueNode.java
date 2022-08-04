package zuoye.Mcs;

import sun.misc.Queue;

public class QueueNode extends Queue {
    private int lock;

    public QueueNode(int lock){
        this.lock=lock;
    }

    public int getLock() {
        return lock;
    }

    public void setLock(int lock) {
        this.lock = lock;
    }

}
