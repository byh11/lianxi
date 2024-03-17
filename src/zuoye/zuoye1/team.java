package zuoye.zuoye1;

import java.util.ArrayList;

public class team {
    private coach a;
    private ArrayList<player> b;
    private int fraction;

    public team() {
        b=new ArrayList<player>();
        fraction=0;
    }


    public coach getA() {
        return a;
    }

    public void setA(coach a) {
        this.a = a;
    }

    public ArrayList<player> getB() {
        return b;
    }

    public void setB(ArrayList<player> b) {
        this.b = b;
    }

    public void addCoach(player c){
        b.add(c);
    }

    public int getFraction() {
        return fraction;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }

    public void addFraction() {
        fraction++;
    }

}