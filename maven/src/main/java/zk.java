import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class zk implements Watcher {

    private static final int SESSION_TIMEOUT = 10000;
    private static final String CONNECTION_STRING = "192.168.31.17:2181,192.168.31.18:2181,192.168.31.19:2181";
    private static final String ZK_PATH = "/mytest";
    private static ZooKeeper zk = null;

    private CountDownLatch connectedSemaphore = new CountDownLatch(1);

    @Override
    public void process(WatchedEvent watchedEvent) {
        System.out.println("收到事件通知：" + watchedEvent.getState() + "\n");
        if (Event.KeeperState.SyncConnected == watchedEvent.getState()) {
            connectedSemaphore.countDown();
        }
    }

    public void createConnection(String connectString, int sessionTimeout) {
        this.releaseConnection();
        try {
            zk = new ZooKeeper(connectString, sessionTimeout, this);
            connectedSemaphore.await();
        } catch (InterruptedException e) {
            System.out.println("连接创建失败，发生 InterruptedException");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("连接创建失败，发生 IOException");
            e.printStackTrace();
        }
    }

    public void releaseConnection() {
        if (this.zk!=null) {
            try {
                this.zk.close();
            } catch (InterruptedException e) {
                // ignore
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        zk zookeeper=new zk();
        zookeeper.createConnection(CONNECTION_STRING,SESSION_TIMEOUT);
        try {
            while (true) {
                zk.exists("/mytest", new Watcher() {
                    @Override
                    public void process(WatchedEvent event) {
                        System.out.println("/mytest 发生了变化");
                        System.out.println(event.getPath());
                        System.out.println(event.getState());
                        System.out.println(event.getType());
                        System.out.println(event.getWrapper());
                    }
                });
            }
        } catch (KeeperException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
