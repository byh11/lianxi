package zuoye.Mcs;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Lock.LOCK.lock();
                    System.out.println(finalI+"进入");
                    try {
                        Thread.sleep(finalI*100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(finalI+"退出");
                    Lock.LOCK.unlock();
                }
            }).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
