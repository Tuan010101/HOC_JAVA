package qlcsvc;

import java.sql.*;

public class ConnectMySQL {
    private static String DB_URL = "jdbc:mysql://localhost:3306/demosqljava";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public static void lietKe(Statement stmt) throws SQLException {
        System.out.println("\nHien thi CSDL");
        // lấy dữ liệu từ table 'university'
        ResultSet rs = stmt.executeQuery("select * from university");
        // hiển thị dữ liệu
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "  " + rs.getString("name"));
        }
    }
    public static void capNhat(Statement stmt, String id, String name) throws SQLException {
        System.out.println("\nDa cap nhat du lieu co id: " + id);
        String update = "UPDATE university SET name = '"+ name +"' WHERE id = " + id;
        stmt.executeUpdate(update);
        lietKe(stmt);
    }
    public static void them(Statement stmt, String id, String name) throws SQLException {
        System.out.println("\nDa them du lieu co id: " + id + ", name: " + name);
        String add = "INSERT INTO university VALUES ( "+ id +", '"+ name +"' )";
        stmt.executeUpdate(add);
        lietKe(stmt);
    }
    public static void xoa(Statement stmt, String id) throws SQLException {
        System.out.println("\nDa xoa du lieu co id: " + id);
        String delete = "DELETE FROM university " + "WHERE id = " + id;
        stmt.executeUpdate(delete);
        lietKe(stmt);
    }

    public static void main(String args[]) {
        try {
            // kết nối tới file dữ liệu 'demosqljava'
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connect succesfully!");
            // tạo statement để kết nối csds
            Statement stmt = conn.createStatement();
            lietKe(stmt);
            them(stmt,"1","Đại học 10");
            xoa(stmt,"1");
            capNhat(stmt,"5","Đại học năm");
            // ngắt kết nối
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
