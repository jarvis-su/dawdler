package com.jarvis.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JdbcUtil {
    static final String date_format = "yyyyMMddHHmmss";

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            insertRecords(conn, 1000000);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://192.168.31.117:3306/jarvis_db", "jarvis_db", "mYsqL$%123");
    }

    static void insertRecords(Connection conn, long number) {
        StringBuffer sql = new StringBuffer();
        SimpleDateFormat sdf = new SimpleDateFormat(date_format);
        for (long l = 0; l < number; l++) {
            try (Statement stmt = conn.createStatement()) {
                sql = new StringBuffer("insert into student(NO,name) values('");

                StringBuffer no = new StringBuffer(sdf.format(new Date()));
                no.append(l % 10000);
                sql.append(no.toString());

                sql.append("'");
                sql.append(",'");
                sql.append("Test");
                sql.append(l % 10000);
                sql.append("')");
                stmt.executeUpdate(sql.toString());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
