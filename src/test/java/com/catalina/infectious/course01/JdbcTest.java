package com.catalina.infectious.course01;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class JdbcTest {
    @Test
    void databaseTest() {
        String userName = "root";
        String password = "123456";
        String url = "jdbc:mysql://localhost:3306/amadeusdb?serverTimezone=Asia/Shanghai";
        String driverName = "com.mysql.cj.jdbc.Driver";
        String testSql = "select * from dbtest;";
        System.out.println(driverName);
        try {
            Class.forName(driverName);
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement statement = connection.prepareStatement(testSql);
            statement.executeQuery();
            ResultSet res = statement.getResultSet();
            while (res.next()) {
                System.out.println(res.getString("test_column"));
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }
}
