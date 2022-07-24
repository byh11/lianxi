package LeetCode;

public class T_1184 {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int x=0,x1=0,s=start;
        for (int i=0;i<distance.length;++i){
            if(start==destination){
                break;
            }
            x+=distance[start++];
            if(start== distance.length){
                start=0;
            }
        }
        for (int i=0;i<distance.length;++i){
            if(s==destination){
                break;
            }
            s--;
            if(s<0){
                s= distance.length-1;
            }
            x1+=distance[s];

        }
        return Math.min(x,x1);
    }

    public static void main(String[] args) {
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3));
    }
}
