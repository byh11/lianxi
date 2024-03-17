package zuoye;

public class Mouse {
    private String name;
    public boolean isAlive=true;
    public Mouse(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "zuoye.Mouse{" +
                "name='" + name + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
