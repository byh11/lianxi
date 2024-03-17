package zuoye.zuoye1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<team> t=new ArrayList<>(15);
//初始化球队
        for (int i = 0; i < 15; i++) {
            team t0 = new team();
            t0.setA(new coach("111",28,180,180,18000));
            ArrayList<player> p=new ArrayList<>();
            p.add(new player("222",18,182,180,"前锋"));
            p.add(new player("333",18,182,180,"后卫"));
            p.add(new player("444",18,182,180,"守门员"));
            p.add(new player("555",18,182,180,"替补"));
            p.add(new player("666",18,182,180,"后卫"));
            p.add(new player("777",18,182,180,"前锋"));
            t0.setB(p);
            t.add(t0);
        }

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        Date date = new Date(System.currentTimeMillis());

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (i==j){
                    continue;
                }
                float a=(float)Math.random();

                System.out.print("时间:"+formatter.format(date)+" 地点:"+"江苏 ");
                if (a<0.3){
                    team team = t.get(i);
                    team.addFraction();
                    t.set(i,team);
                    System.out.println("结果： "+i+"队胜利");
                }else if (a<0.65){
                    team team = t.get(j);
                    team.addFraction();
                    t.set(j,team);
                    System.out.println("结果： "+j+"队胜利");
                }else {
                    team team = t.get(i);
                    team.addFraction();
                    t.set(i,team);
                    team = t.get(j);
                    team.addFraction();
                    t.set(j,team);
                    System.out.println("结果： "+i+"队"+j+"队"+"平局");
                }
            }
        }
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 15; i++) {
            System.out.println(i+"队:"+t.get(i).getFraction());
        }
    }
}