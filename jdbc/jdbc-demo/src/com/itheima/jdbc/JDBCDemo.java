package com.itheima.jdbc;

import cm.itheima.jdbc.Questionnaire;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/questionnaire?useSSL=false";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "update qe_questionnaire set qe_description = 'test'";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);

        String sql2 = "select * from qe_questionnaire";
        PreparedStatement pstmt = conn.prepareStatement(sql2);
        ResultSet rs = pstmt.executeQuery();
        List<Questionnaire> questionnaires = new ArrayList<>();
        while (rs.next()) {
            Questionnaire questionnaire = new Questionnaire();
            questionnaire.setQe_id(rs.getInt("qe_id"));
            questionnaire.setQe_title(rs.getString("qe_title"));
            questionnaire.setQe_creator(rs.getString("qe_creator"));

            questionnaires.add(questionnaire);
        }
        System.out.println(questionnaires);


        stmt.close();
        rs.close();
        pstmt.close();
        conn.close();

    }
}
