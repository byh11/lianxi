package LeetCode;

import java.util.ArrayList;

public class T_1845 {
    static class SeatManager {
//        ArrayList<Integer> a=new ArrayList<Integer>();
//        public SeatManager(int n) {
//            for (int i=0;i<n;++i){
//                a.add(i+1);
//            }
//        }
//
//        public int reserve() {
//            int i=a.get(0);
//            a.remove(0);
//            return i;
//        }
//
//        public void unreserve(int seatNumber) {
//            a.add(seatNumber-1,seatNumber);
//        }
        int[] a;
        int[] b;
        int n=0;
        public SeatManager(int n) {
            a=new int[n];
            b=new int[n];
            for (int i=0;i<n;++i){
                a[i]=i+1;
                b[i]=1;
            }
        }

        public int reserve() {
            for (int i=n;i<a.length;i++){
                if(b[i]!=0){
                    b[i]=0;
                    n=i;
                    return a[i];
                }
            }
            return 0;
        }

        public void unreserve(int seatNumber) {
            b[seatNumber-1]=1;
            if(n>seatNumber-1){
                n=seatNumber-1;
            }
        }
    }

    public static void main(String[] args) {
        SeatManager seatManager=new SeatManager(5);
        seatManager.reserve();    // 所有座位都可以预约，所以返回最小编号的座位，也就是 1 。
        seatManager.reserve();    // 可以预约的座位为 [2,3,4,5] ，返回最小编号的座位，也就是 2 。
        seatManager.unreserve(2); // 将座位 2 变为可以预约，现在可预约的座位为 [2,3,4,5] 。
        seatManager.reserve();    // 可以预约的座位为 [2,3,4,5] ，返回最小编号的座位，也就是 2 。
        seatManager.reserve();    // 可以预约的座位为 [3,4,5] ，返回最小编号的座位，也就是 3 。
        seatManager.reserve();    // 可以预约的座位为 [4,5] ，返回最小编号的座位，也就是 4 。
        seatManager.reserve();    // 唯一可以预约的是座位 5 ，所以返回 5 。
        seatManager.unreserve(5);

    }
}
