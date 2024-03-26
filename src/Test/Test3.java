package Test;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(Test3_A.a);
    }

}

class Test3_A {
    //会执行static块
    public static final int a = Integer.valueOf("1");
    //不会执行static块
//    public static final int a = 1;
    static {
        System.out.println("Test3_A");

    }
}
