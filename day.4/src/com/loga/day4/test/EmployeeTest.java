package com.loga.day4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day4.emp.Employee;
import com.loga.day4.emp.President;
import com.loga.day4.emp.SalesManager;



class EmployeeTest {

Employee employee;

	
	@Test
	void testCalculateSalaryPresident() {
		employee = new President(12768, "Abi", 10);
		System.out.println(employee.calculateNetSalary(7000));
		assertEquals(12040, employee.calculateNetSalary(7000), 0.3);
		System.out.println(employee.toString());
	}

	@Test
	void testCalculateSalarySalsman() {
		employee = new SalesManager(12768, "Abi");
		System.out.println(employee.calculateNetSalary(7000));
		assertEquals(11640.0, employee.calculateNetSalary(7000), 0.3);
		System.out.println(employee.toString());
	}
}
