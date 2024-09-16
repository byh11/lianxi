package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class T17 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        if (list.contains(2)) {
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }

    public int[] paginatePosts(int[] posts, int page, int pageSize) {
        // write code here
        if (posts.length <= (page - 1) * pageSize) {
            return new int[0];
        }
        int r = page * pageSize;
        int l = r - pageSize;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < posts.length; i++) {
            list.add(posts[i]);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = l; i < r; i++) {
            if (list.contains(i)) {
                list1.add(list.get(i));
            }
        }
        int[] res=new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            res[i]=list1.get(i);
        }
        return res;
    }

}

