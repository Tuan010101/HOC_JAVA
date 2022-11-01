package qlcsvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMySQL {
    private static String DB_URL = "jdbc:mysql://localhost:3306/demosqljava";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public static void main(String args[]) {
        try {
            // kết nối tới file dữ liệu 'demosqljava'
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connect succesfully!");
            // tạo statement để kết nối csds
            Statement stmt = conn.createStatement();
            // lấy dữ liệu từ table 'student'
            ResultSet rs = stmt.executeQuery("select * from university");
            // hiển thị dữ liệu
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " + rs.getString("name"));
            }
            // ngắt kết nối
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
