package com.jarvis.db;

import com.jarvis.entity.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.jarvis.db.JdbcUtil.getConnection;

public class ListStudents {

    static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {

            String sql = "select * from student";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student stu = new Student();
                stu.setNo(rs.getString(1));
                stu.setName(rs.getString(2));
                studentList.add(stu);
            }
            System.out.println(studentList.size());

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
