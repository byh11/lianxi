package LeetCode;

import java.util.*;

public class T_636 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("0:start:0");
        list.add("0:start:2");
        list.add("0:end:5");
        list.add("1:start:6");
        list.add("1:end:6");
        list.add("0:end:7");
        int[] a=exclusiveTime(2,list);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] exclusiveTime(int n, List<String> logs) {
        Deque<int[]> stack = new ArrayDeque<int[]>();
        int[] res = new int[n];
        for (String log : logs) {
            int idx = Integer.parseInt(log.substring(0, log.indexOf(':')));
            String type = log.substring(log.indexOf(':') + 1, log.lastIndexOf(':'));
            int timestamp = Integer.parseInt(log.substring(log.lastIndexOf(':') + 1));
            if ("start".equals(type)) {
                if (!stack.isEmpty()) {
                    res[stack.peek()[0]] += timestamp - stack.peek()[1];
                    stack.peek()[1] = timestamp;
                }
                stack.push(new int[]{idx, timestamp});
            } else {
                int[] t = stack.pop();
                res[t[0]] += timestamp - t[1] + 1;
                if (!stack.isEmpty()) {
                    stack.peek()[1] = timestamp + 1;
                }
            }
        }
        return res;

    }
}
