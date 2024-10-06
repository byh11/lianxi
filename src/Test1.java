import java.util.ArrayList;

public class Test1 {

    static Object o1 = new Object();
    static Object o2 = new Object();

    public static void main(String[] args) {
//        ArrayList<String> l = new ArrayList<>();
//        l.add("");
//        T1("zxcasdwabcdefedcbwda", l);
//        System.out.println(l.get(0));
        Thread t1 = new Thread(new run1());
        Thread t2 = new Thread(new run2());
        t1.start();
        t2.start();
    }


    public static class run1 implements Runnable {

        @Override
        public void run() {
            synchronized (o1) {
                try {
                    o2.wait();
                    System.out.println(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(1);
//                synchronized (o2) {
//                    System.out.println(2);
//                }
            }
        }
    }

    public static class run2 implements Runnable {
        @Override
        public void run() {
            synchronized (o2) {
                System.out.println(3);
//                synchronized (o1) {-*/6+
                try {
                    o1.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(4);
//                }
            }
        }
    }


    //1.输入字符串，输出长度最长的回文子串
    //2.


    public static void T1(String s, ArrayList<String> list) {
//        if (t(s)) {
//            if (s.length() > list.get(0).length()) {
//                list.remove(0);
//                list.add(s);
//            }
//            return;
//        }
//        T1(s.substring(1, s.length()), list);
//        T1(s.substring(0, s.length() - 1), list);
        for (int i = 0; i < s.length(); i++) {
            int l = i - 1;
            int r = i + 1;
            if (l < 0) {
                l = 0;
            }
            if (r >= s.length()) {
                r = s.length() - 1;
            }
            String s1 = s.substring(l, r + 1);
            while (s.charAt(l) == s.charAt(r)) {
                if (s1.length() > list.get(0).length()) {
                    list.remove(0);
                    list.add(s1);
                }

                if (l == 0 && r == s.length() - 1)
                    break;
                l--;
                r++;
                if (l < 0) {
                    l = 0;
                }
                if (r >= s.length()) {
                    r = s.length() - 1;
                }
                s1 = s.substring(l, r + 1);
            }

        }

    }

//    public static boolean t(String s) {
//        if (s.length() <= 1)
//            return true;
//        if (s.charAt(0) == s.charAt(s.length() - 1)) {
//            return t(s.substring(1, s.length() - 1));
//        }
//        return false;
//    }
}
