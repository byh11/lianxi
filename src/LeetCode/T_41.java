package LeetCode;

public class T_41 {
    static class MovingAverage {
        private int[] size;
        int n=0,m=0,s=0;
        public MovingAverage(int size) {
            this.size=new int[size];
        }

        public double next(int val) {
            double a=0;
            if(s>=size.length){
                n=m;
                size[n++]=val;
                m++;
                if(m==size.length){
                    m=0;
                }
                for (int i=0;i<size.length;++i){
                    a+=size[i];
                }
                a=a/ size.length;
            }else {
                size[n++]=val;
                for (int i=0;i<size.length;++i){
                    a+=size[i];
                }
                a=a/n;
            }
            s++;

            return a;
        }
    }

    public static void main(String[] args) {
        MovingAverage a=new MovingAverage(5);
        System.out.println(a.next(12009));
        System.out.println(a.next(1965));
        System.out.println(a.next(3));
        System.out.println(a.next(5));
    }
}
