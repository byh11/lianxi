package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            s=s.substring(0,i)+s.substring(i+1,s.length())+s.substring(i,i+1);
        }
        System.out.println(s);
//        System.out.println("A");
//        new Test1();
//        new Test1();

    }

//    public Test1() {
//        System.out.println("B");
//    }

//    {
//        System.out.println("C");
//    }
//
//    static {
//        System.out.println("D");
//    }

}
