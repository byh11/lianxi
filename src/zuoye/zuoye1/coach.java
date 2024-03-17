package zuoye.zuoye1;

public class coach {
    private String name;
    private int age;
    private double weight;
    private double height;
    private int salary;

    public coach(String name, int age, double weight, double height, int salary) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}