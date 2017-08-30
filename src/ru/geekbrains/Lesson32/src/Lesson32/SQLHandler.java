package Lesson32;

import java.sql.*;

public class SQLHandler {
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private PreparedStatement ps;

    public void openConnection() throws Exception {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:D:\\Java_lib\\TestDB.db");
        stmt = conn.createStatement();
    }

    public void closeConnection() throws Exception {
        ps.close();
        stmt.close();
        conn.close();
    }

    public void fillDB() throws SQLException {
        conn.setAutoCommit(false);
        ps = conn.prepareStatement("INSERT INTO MyDB (prodid, title, cost) VALUES (?,?,?)");
        for (int i = 1; i <= 10000; i++) {
            ps.setInt(3, i * 10);
            ps.setString(2, "товар" + i);
            ps.setInt(1, i);
            ps.addBatch();
        }
        ps.executeBatch();
        conn.setAutoCommit(true);
        System.out.println("DBase is filled");
    }

    public void delAll() throws SQLException {
        conn.setAutoCommit(false);
        ps = conn.prepareStatement("DELETE FROM MyDB;");
        ps.addBatch();
        ps.executeBatch();
        conn.setAutoCommit(true);
        System.out.println("DBase is cleared");
    }

    public String getCost(String title) throws SQLException {
        ps = conn.prepareStatement("SELECT cost FROM MyDB WHERE (title=?);");
        ps.setString(1, title);
        rs = ps.executeQuery();
        return rs.isClosed() ? "Такого товар нет в нашей базе" : rs.getString(1);
    }

    public void setCost(String title, int cost) throws SQLException {
        if (!getCost(title).equals("Такого товар нет в нашей базе")) {
            ps = conn.prepareStatement("UPDATE MyDB SET cost=? WHERE title=?;");
            ps.setString(2, title);
            ps.setInt(1, cost);
            ps.execute();
            System.out.println("Операция изменения цены завершена!");
        }
    }

    public void getProduct(int... range) throws SQLException {
        ps = conn.prepareStatement("SELECT * FROM MyDB WHERE cost BETWEEN ? AND ?;");
        ps.setInt(2, range[1]);
        ps.setInt(1, range[0]);
        rs = ps.executeQuery();
        System.out.printf("%6s %6s %12s %10s\n", "ID", "ProductID", "Title", "Cost");
        while (rs.next()) System.out.printf("%6s %6s %12s %10s\n", rs.getString(1), rs.getString(2),
                rs.getString(3), rs.getString(4));
    }
}
