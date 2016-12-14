package com.jarvis.db;

import com.jarvis.entity.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.jarvis.db.JdbcUtil.getConnection;

public class ListStudents {
    static List<Student> studentList = new ArrayList<>();
    private static Logger logger = LogManager.getLogger(ListStudents.class.getName());

    public static void main(String[] args) {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {

            String sql = "select * from student";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student stu = new Student();
                stu.setNo(rs.getString(1));
                stu.setName(rs.getString(2));
                studentList.add(stu);
                logger.debug(stu.getNo() + " --- " + stu.getName());
            }
            logger.debug("Total size is " + studentList.size());

        } catch (SQLException e) {
            logger.error(e.getMessage());
        } catch (ClassNotFoundException e) {
            logger.error(e.getMessage());
        }

    }
}
