package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.DAO.employeeDAO;
import com.mindgate.pojo.Employee;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private PrintWriter printWriter;
	private String name;
	private double salary;
	private employeeDAO dao=new employeeDAO();
	private boolean result;
	
       
    public AddEmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		printWriter=response.getWriter();
		name=request.getParameter("txtname");
		salary=Double.parseDouble(request.getParameter("txtSalary"));
		
		printWriter.println("Name : "+name);
		printWriter.println("Salary : "+salary);
		
		Employee employee=new Employee(0, name, salary);
		
		result=dao.addEmployee(employee);
		
		response.setContentType("text/html");
		if(result)
		{
			printWriter.println("Record added successfully");
			printWriter.println("<a href=\"addemployee.html\">Add New Employee</a>");
		}
		else
		{
			printWriter.println("Failed to add");
			printWriter.println("<a href=employeeHome.html>Home Page</a>");
		}
	}

}
