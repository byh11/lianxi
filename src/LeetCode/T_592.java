package LeetCode;

public class T_592 {
    public static void main(String[] args) {
        System.out.println(fractionAddition("8/3+1/1-8/3"));
    }
    public static String fractionAddition(String expression) {
        String s = "";
        String[] ss=new String[expression.length()];
        int n=0;
        String[] s1=expression.split("\\+");
        for (int i=0;i<s1.length;++i){
            String[] s2=s1[i].split("/");
            for (int j = 0; j < s2.length; j++) {
                String[] s3=s2[j].split("-");
                if(!s3[0].equals("")){
                    ss[n++]=s3[0];
                }
                if(s3.length>1){
                    ss[n++]="-"+s3[1];
                }
            }
        }
        int l=1;
        for (int i = 1; i < n; i+=2) {
                int m=Integer.valueOf(ss[i]);
                l*=m;
        }
        for (int i = 0; i < n; i+=2) {
            if(l==1){
                l=Integer.valueOf(ss[1]);
                break;
            }
            int o=l/Integer.valueOf(ss[i+1]);
            o*=Integer.valueOf(ss[i]);
            ss[i]=String.valueOf(o);
        }
        int m=0;
        for (int i=0;i<n;i+=2){
            m+=Integer.valueOf(ss[i]);
        }
        if(m==0){
            s=String.valueOf("0/1");
        }else {
            for (int i=2;i<=(l>m?l:m);++i){
                if(m%i==0 && l%i==0){
                    m/=i;
                    l/=i;
                    i=1;
                }
            }

            s=String.valueOf(m)+"/"+l;
        }
        return s;
    }
}
