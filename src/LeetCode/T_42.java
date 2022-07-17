package LeetCode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class T_42 {
    static class RecentCounter {
        Queue<Integer> queue=new ArrayDeque();
        public RecentCounter() {
        }

        public int ping(int t) {
            queue.offer(t);
            while (queue.peek() < (t-3000)){
                queue.poll();
            }
            return queue.size();
        }
    }

    public static void main(String[] args) {
        RecentCounter recentCounter=new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }
}
