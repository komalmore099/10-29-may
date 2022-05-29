package com.mindgate.dao;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> empolyeeSet=new HashSet<Employee>();
	
	//add new employee
	public boolean addnewEmployee(Employee employee) {
		return empolyeeSet.add(employee);
		
	}
	
	//update existing employee
	public boolean updateEmployee(Employee employee)
	{
		for (Employee e: empolyeeSet) 
		{
		   if(e.getEmployeeId() == employee.getEmployeeId())
		   {
			   e.setName(employee.getName());
			   e.setSalary(employee.getSalary());
			   return true;
		   }
			
		}

		return false;
	}
	
	//delete employee
	public boolean deleteEmployeeByID(int employeeId)
	{
		for (Employee e1 : empolyeeSet)
		{
			if(e1.getEmployeeId() == employeeId)
			{
				return empolyeeSet.remove(e1);
				
			}
			
		}
		return false;
	}
	
	//get single employee by employee ID
	public Employee getEmployeeByEmployeeID(int employeeId)
	{
		for (Employee e3 : empolyeeSet)
		{
			if(e3.getEmployeeId() ==employeeId)
			{
				return e3;
			}
			
		}
		return null;
	}
	
	//get all the employees
	public Set<Employee> getAllEmployees()
	{
		return empolyeeSet;
	}

}
