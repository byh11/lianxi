package zuoye.zuoye1;

public class res {

    public static void main(String[] args) {

        System.out.println(res(-12345L));
    }

    public static Long res(Long n) {
        n=Math.abs(n);
        StringBuilder s = new StringBuilder(n.toString());
        s.reverse();
        s= new StringBuilder("-" + s);
        System.out.println(s);
        return 0L;
    }
}
