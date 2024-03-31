package org.myself.code.service;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author FatCow
 */
public class JdbcTest {

    @Test
    public void getDataSource() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("service:mysql://192.168.0.113:3306/JAVA?serverTimezone=UTC&characterEncoding=UTF-8&useSSL=false", "root", "123456");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM JAVA.Study");
            ResultSet resultSet = preparedStatement.executeQuery();
            int row = resultSet.getRow();
            for (int i = 0; i < row; i++) {
                int id = resultSet.findColumn("Id");
                System.out.println("id" + id);
            }
            System.out.println("row:" + row);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
