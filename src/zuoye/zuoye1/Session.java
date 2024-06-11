//package zuoye.zuoye1;
//
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class Session {
//    public void save(Data data) throws SQLException, InvocationTargetException, IllegalAccessException {
//        MysqlDataSource mysql=new MysqlDataSource();
//        mysql.setUrl("jdbc:mysql://localhost:3306/test");
//        mysql.setUser("root");
//        mysql.setPassword("root");
//        mysql.setUseSSL(false);
//        mysql.setCharacterEncoding("UTF-8");
//        Connection connection=mysql.getConnection();
//        String sql="insert into Data values(";
//        String sql1="";
//        Data.class.getMethods();
//        Method[] methodArray = Data.class.getMethods();
//        int i=0;
//        for(Method m : methodArray){
//            i++;
//            if(i%2==0) {
//                continue;
//            }
//            sql+=sql1;
//            sql1="\""+m.invoke(data,null).toString()+"\",";
//            if(i>158){
//                break;
//            }
//        }
//        String[] s=sql1.split(",");
//        sql+=s[0]+");";
//        PreparedStatement ps=connection.prepareStatement(sql);
//        int rs = ps.executeUpdate();
////        PreparedStatement ps=connection.prepareStatement("select * from Data");
////        ResultSet rs = ps.executeQuery();
////        while (rs.next()) {
////            String id = rs.getString("NCORIE");
////            System.out.println(id);
////        }
//    }
//
//}
