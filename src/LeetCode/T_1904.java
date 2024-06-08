package LeetCode;

public class T_1904 {

    public static void main(String[] args) {

        numberOfRounds("00:01","00:59");
    }

    public static int numberOfRounds(String loginTime, String logoutTime) {
        int a=0;
        String[] login=loginTime.split(":");
        String[] logout=logoutTime.split(":");
        int[] start=new int[2];
        int[] stop=new int[2];
        start[0]=Integer.valueOf(login[0]);
        start[1]=Integer.valueOf(login[1]);
        stop[0]=Integer.valueOf(logout[0]);
        stop[1]=Integer.valueOf(logout[1]);
        if(start[0]==stop[0]){
            if (start[1]<stop[1] && Math.abs(stop[1]-start[1])<15)
                return 0;
        }
        int min=start[1];
        if(min<=15 && min>0){
            start[1]=15;
        }else if(min>15 && min<=30){
            start[1]=30;
        }else if(min>30 && min<=45){
            start[1]=45;
        }else if(min==0){

        } else {
            start[1]=0;
            start[0]+=1;
            if(start[0]==24){
                start[0]=0;
            }
        }
        min=stop[1];
        if(min<15 && min>=0){
            stop[1]=0;
        }else if(min>=15 && min<30){
            stop[1]=15;
        }else if(min>=30 && min<45){
            stop[1]=30;
        }else {
            stop[1]=45;
        }
        while (true){
            if(start[0]==stop[0]){
                if (start[1]==stop[1]){
                    return a;
                }
            }
            start[1]+=15;
            if(start[1]==60){
                start[1]=0;
                start[0]+=1;
                if(start[0]==24){
                    start[0]=0;
                }
            }
            a++;
        }

    }
}
