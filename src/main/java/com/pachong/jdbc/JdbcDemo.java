package com.pachong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public void testInsert(String cname,String introduce,String logo ) {

        try {
            /*1. 加载驱动*/
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 准备数据库连接URL，用户，密码
            String url = "jdbc:mysql://10.8.159.8:3306/wine_project?serverTimezone=UTC&characterEncoding=UTF8";
            String user = "test";
            String password = "111111";

            //3. 获取数据库连接
            Connection connection = DriverManager.getConnection(url, user, password);

            //4. 获取Statement对象
            Statement statement = connection.createStatement();
            //5. 准备SQL语句
            String sql = "insert into company(cname,introduce,logo) values('"+cname+"','"+introduce+"','"+logo+"')";
            //6. insert操作，使用executeUpdate
            int count = statement.executeUpdate(sql);

            //System.out.println(count);

            //7. 关闭资源
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
