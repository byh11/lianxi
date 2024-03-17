package zuoye;

public class Cat {
    String name;
    int record=0;
    public Cat(String name){
        this.name=name;
    }
    public void catchMouse(Mouse mouse){
        mouse.isAlive=false;
        this.record++;
    }

    @Override
    public String toString() {
        return "zuoye.Cat{" +
                "name='" + name + '\'' +
                ", record=" + record +
                '}';
    }
}
