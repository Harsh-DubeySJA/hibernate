package com.java.hibernate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.connection.ConnectionProvider;
import com.java.hibernate.bean.Employee;

public class EmployeeDao {
    public void save(Employee employee) throws SQLException {
        String sqlQuery = """
                INSERT INTO EMPLOYEE VALUES(?, ?, ?)
                """;
        Connection connection = ConnectionProvider.getConnection();
        PreparedStatement statement = connection.prepareStatement(sqlQuery);
        statement.setInt(1, employee.getId());
        statement.setString(2, employee.getName());
        statement.setString(3, employee.getCompany());
        int executeUpdate = statement.executeUpdate();
        if (executeUpdate>0)
            System.out.println("record saved");
        else
            System.out.println("not saved..");
    }   
}
