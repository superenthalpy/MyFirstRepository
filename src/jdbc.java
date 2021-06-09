import com.mysql.jdbc.Driver;

import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
        String sql = "select * from ?";
        PreparedStatement psm = conn.prepareStatement(sql);
        psm.setObject(1,"users");
        ResultSet rs = psm.executeQuery();
        while (rs.next()){
            System.out.print(rs.getString(1));
            System.out.println(rs.getString(2));
        }
    }
}
