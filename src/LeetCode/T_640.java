package LeetCode;

public class T_640 {
    public static String solveEquation(String equation) {
        String[] s=equation.split("=");
        String[] l=xx(s[0]);
        String[] r=xx(s[1]);
        int ln=0,rn=0;
        int lx=0,rx=0;
        for (int i = 0; i < l.length; i++) {
            if(l[i]==null)
                break;
            if(!l[i].contains("x")){
                ln+=Integer.valueOf(l[i]);
            }else {
                String[] xx=l[i].split("x");
                if(l[i].contains("-")){
                    if(xx[0].equals("-")){
                        lx+=-1;
                    }else{
                        lx+=Integer.valueOf(xx[0]);
                    }
                }else {
                    if(xx.length==0){
                        lx+=1;
                    }else {
                        lx+=Integer.valueOf(xx[0]);
                    }
                }
            }
        }
        for (int i = 0; i < r.length; i++) {
            if(r[i]==null)
                break;
            if(!r[i].contains("x")){
                rn+=Integer.valueOf(r[i]);
            }else {
                String[] xx=r[i].split("x");
                if(r[i].contains("-")){
                    if(xx[0].equals("-")){
                        rx+=-1;
                    }else{
                        rx+=Integer.valueOf(xx[0]);
                    }
                }else {
                    if(xx.length==0){
                        rx+=1;
                    }else {
                        rx+=Integer.valueOf(xx[0]);
                    }
                }
            }
        }
        if(ln==rn&&lx==rx){
            return "Infinite solutions";
        }
        lx-=rx;
        rn-=ln;
        if(lx==0){
            return "No solution";
        }
        if(lx==1){
            return "x="+String.valueOf(rn);
        }else {
            return "x="+String.valueOf(rn/lx);
        }
    }

    public static String[] xx(String expression){
        String s = "";
        String[] ss=new String[expression.length()];
        int n=0;
        String[] s1=expression.split("\\+");
        for (int i=0;i<s1.length;++i){
            String[] s2=s1[i].split("-");
            for (int j = 0; j < s2.length; j++) {
                if(!s2[0].equals("")){
                    ss[n++]=s2[0];
                    s2[0]="";
                }
                if(j>=1){
                    ss[n++]="-"+s2[j];
                }
            }
        }
        return ss;
    }

    public static void main(String[] args) {
        System.out.println(solveEquation("2+2-x+x+3x=x+2x-x+x+4"));
    }
}
