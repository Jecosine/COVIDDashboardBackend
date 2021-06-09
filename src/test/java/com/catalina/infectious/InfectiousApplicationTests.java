package com.catalina.infectious;

import org.springframework.beans.factory.annotation.Value;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.*;

@SpringBootTest
class InfectiousApplicationTests {
    @Value("${spring.datasource.username}")
    private String userName;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driverName;
    @Value("${spring.datasource.url}")
    private String url;
    @Test
    void contextLoads() {
    }

    @Test
    void databaseTest() {
//        String userName = "root";
//        String password = "123456";
//        String url = "jdbc:mysql://localhost:3306/amadeusdb?serverTimezone=Asia/Shanghai";
//        String driverName = "com.mysql.cj.jdbc.Driver";
        return ;
//        String testSql = "select * from dbtest;";
//        System.out.println(driverName);
//        try {
//            Class.forName(driverName);
//            Connection connection = DriverManager.getConnection(url, userName, password);
//            PreparedStatement statement = connection.prepareStatement(testSql);
//            statement.executeQuery();
//            ResultSet res = statement.getResultSet();
//            while (res.next()) {
//                System.out.println(res.getString("test_column"));
//            }
//        } catch (SQLException | ClassNotFoundException throwables) {
//            throwables.printStackTrace();
//        }

    }

}
