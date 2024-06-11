//package zuoye.zuoye1;
//
//
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class Dao {
//    private MysqlDataSource mysql=new MysqlDataSource();
//    private Connection connection;
//    public void Dao() throws SQLException {
//    }
//
//    public int insert(String sql) throws SQLException {
//        mysql.setUrl("jdbc:mysql://localhost:3306/test");
//        mysql.setUser("root");
//        mysql.setPassword("root");
//        mysql.setUseSSL(false);
//        mysql.setCharacterEncoding("UTF-8");
//        connection = mysql.getConnection();
//        PreparedStatement ps = connection.prepareStatement(sql);
//        int rs = ps.executeUpdate();
//        return rs;
//    }
//
//    public ResultSet select(String sql) throws SQLException {
//
//        connection = mysql.getConnection();
//        PreparedStatement ps = connection.prepareStatement(sql);
//        ResultSet rs = ps.executeQuery();
//        return rs;
//    }
//
//}
