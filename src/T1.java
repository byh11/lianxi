import java.util.concurrent.ConcurrentHashMap;

public class T1  {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Boolean> map=new ConcurrentHashMap<String, Boolean>();
        map.put("aaa",true);
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (map.get("aaa")){
                    System.out.println("aaa");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        map.put("aaa",false);

    }

}

