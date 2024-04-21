package Test;

public class Test4 {

    public static void main(String[] args) {
        flipImage(2,new int[]{1,1,1,1,2,2,2,2});
    }

    public static boolean kInArray (int k, int target) {
        // write code here
        if(k==target || (k*2+1)==target || (k*3+1)==target){
            return true;
        }else {
            return false;
        }
    }



    public static int[] flipImage (int width, int[] pixels) {
        // write code here
        int[] t=new int[pixels.length];
        int j=1;
        for (int i = 0; i < pixels.length; i++) {
            t[i]=pixels[1*width*4-1-i];
            if(i==j*width*4-1){
                j++;
            }
        }
        return t;
    }


    /*
        1111,2222
        3333,4444

        2222,1111
        4444,3333



     */
}
