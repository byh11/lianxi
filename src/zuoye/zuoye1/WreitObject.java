package zuoye.zuoye1;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;

public class WreitObject {
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, SQLException {
        File file=new File("t.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String s;
        Data data=new Data();
        while ((s=bufferedReader.readLine())!=null){
            String[] s1=s.split("=");
            Method method=Data.class.getMethod("set"+s1[0],String.class);
            method.invoke(data,s1[1]);
        }
        Session session=new Session();
        session.save(data);
    }
}
