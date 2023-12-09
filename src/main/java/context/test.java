
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        // Thông tin kết nối SQL Server
        String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanGiay";
        String username = "demo3";
        String password = "123";

        // Thử kết nối
        try {
            // Đăng ký driver JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Tạo kết nối
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Kiểm tra kết nối thành công
            if (connection != null) {
                System.out.println("Kết nối thành công!");
                // Đóng kết nối sau khi sử dụng
                connection.close();
            } else {
                System.out.println("Kết nối thất bại!");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
