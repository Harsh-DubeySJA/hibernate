package com.java.hibernate;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.hibernate.bean.Employee;
import com.java.hibernate.dao.EmployeeDao;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Ram");
		employee.setCompany("StarWork");

		EmployeeDao employeeDao = new EmployeeDao();
		try {
			employeeDao.save(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
