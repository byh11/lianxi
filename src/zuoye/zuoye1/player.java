package zuoye.zuoye1;

public class player {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String position;

    public player(String name, int age, double weight, double height, String position) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}