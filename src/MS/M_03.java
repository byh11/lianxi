package MS;

import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class M_03 {
    public static void main(String[] args) {

        processOrder();
    }

    private static final String FILE_PATH = "orders.txt";
    private static final int TOP_N = 10;
    private static final String OUTPUT_FORMAT = "%s, %.2f%n";

    private static ConcurrentHashMap<String,Double> map=new ConcurrentHashMap<>();

    /*
      设计参数与实现
    */
    private static void processOrder() {
//        Thread t1=new Thread(new run());
//        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        try {
            BufferedReader reader=new BufferedReader(new FileReader(FILE_PATH));
            String read;
            while ((read=reader.readLine())!=null){
                String[] order = read.split(",");
                if(map.containsKey(order[1])){
                    map.put(order[1],Double.valueOf(map.get(order[1])+order[4]));
                }else {
                    map.put(order[1],Double.valueOf(order[4]));
                }
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double[] top10=new double[map.size()];
        int i=0;
        for (Map.Entry m: map.entrySet()){
            top10[i++]= (double) m.getValue();
        }
        Arrays.sort(top10);
        for (int j = 0; j < 10; j++) {
            System.out.println(top10[j]);
        }

    }

//    public static class run implements Runnable{
//        @Override
//        public void run() {
//            try {
//                BufferedReader reader=new BufferedReader(new FileReader(FILE_PATH));
//                String read;
//                while ((read=reader.readLine())!=null){
//                    String[] order = read.split(",");
//                    if(map.containsKey(order[1])){
//                        map.put(order[1],Double.valueOf(map.get(order[1])+order[4]));
//                    }else {
//                        map.put(order[1],Double.valueOf(order[4]));
//                    }
//                }
//                reader.close();
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
