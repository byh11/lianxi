public class Student {
    private int sNO;
    private String sName;
    private String sSex;
    private int sAge;
    private float sJava;

    public Student(int sNO, String sName, String sSex, int sAge, float sJava) {
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public int getsNO() {
        return sNO;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public float getsJava() {
        return sJava;
    }
}

