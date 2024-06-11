//package zuoye.zuoye1;
//
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//
//import java.io.*;
//import java.nio.charset.StandardCharsets;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class NewClass {
//    public static void main(String[] args) throws IOException, SQLException {
//        MysqlDataSource mysql=new MysqlDataSource();
//        mysql.setUrl("jdbc:mysql://localhost:3306/test");
//        mysql.setUser("root");
//        mysql.setPassword("root");
//        mysql.setUseSSL(false);
//        mysql.setCharacterEncoding("UTF-8");
//        Connection connection=mysql.getConnection();
//        File file=new File("t.txt");
//        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
//        String s;
//        String sql="create table Data(";
//        String sql1="";
//        String clazz="package zuoye.zuoye1;\n\nclass Data{\n";
//        while ((s=bufferedReader.readLine())!=null){
//            String[] s1=s.split("=");
//            clazz+="private String "+s1[0]+";\n";
//            sql+=sql1;
//            sql1=s1[0]+" varchar(10),";
//        }
//        clazz+="}\n";
//        String[] split=sql1.split(",");
//        sql+=split[0]+");";
//        bufferedReader.close();
//        File file1= new File("/home/bai/zuoye/src/zuoye/zuoye1/Data.java");
//        if(!file1.exists()) {
//            file1.createNewFile();
//            OutputStream fout = new FileOutputStream(file1);
//            byte[] bbb = new byte[clazz.length()];
//            bbb = clazz.getBytes(StandardCharsets.UTF_8);
//            fout.write(bbb);
//            fout.flush();
//            fout.close();
//        }
//        System.out.println(sql);
//        PreparedStatement ps=connection.prepareStatement(sql);
//        int rs = ps.executeUpdate();
//    }
//
//}
