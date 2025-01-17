package com.edison.Prac04lLess21.Service;

import org.springframework.stereotype.Service;

import com.edison.Prac04lLess21.model.Employee;



@Service
public class EmployeeService {

	public Employee getEmployee() throws EmployeeServiceException {
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

	public Employee getEmployeeNull() throws EmployeeServiceException {

		return null;
	}

	public Employee getEmployeeException() throws EmployeeServiceException {

		throw new EmployeeServiceException();
	}

}
