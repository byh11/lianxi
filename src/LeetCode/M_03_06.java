package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;

public class M_03_06 {

    public static void main(String[] args) {

    }

    class AnimalShelf {

        private LinkedList<ArrayList<Integer>> list;

        public AnimalShelf() {
            this.list=new LinkedList<>();
        }

        public void enqueue(int[] animal) {
            ArrayList<Integer> l=new ArrayList<>();
            for (int i = 0; i < animal.length; i++) {
                l.add(animal[i]);
            }
            list.add(l);
        }

        public int[] dequeueAny() {
            if(list.size()==0){
                return new int[]{-1,-1};
            }
            int[] ints = new int[2];
            ints[0]=list.get(0).get(0);
            ints[1]=list.get(0).get(1);
            list.remove(0);
            return ints;
        }

        public int[] dequeueDog() {
            int i=0;
            while (i<list.size()){
                if (list.get(i).get(1)==1){
                    int[] ints = new int[2];
                    ints[0]=list.get(i).get(0);
                    ints[1]=list.get(i).get(1);
                    list.remove(i);
                    return ints;
                }else {
                    i++;
                }
            }
            return new int[]{-1,-1};
        }

        public int[] dequeueCat() {
            int i=0;
            while (i<list.size()){
                if (list.get(i).get(1)==0){
                    int[] ints = new int[2];
                    ints[0]=list.get(i).get(0);
                    ints[1]=list.get(i).get(1);
                    list.remove(i);
                    return ints;
                }else {
                    i++;
                }
            }
            return new int[]{-1,-1};
        }
    }
}
