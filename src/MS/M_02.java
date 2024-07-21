package MS;



public class M_02 {


    public static class run extends Thread{
        static int a=1;
        static Object lock = new Object();
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                synchronized (lock) {
                    try {
                        lock.notify();
                        System.out.println(Thread.currentThread().getName() + ":" + a++);
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

        Thread t1 =new run();
        Thread t2 =new run();
        t1.start();
        t2.start();
    }


}
