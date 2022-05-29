package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetAllEmployeeServlet")
public class GetAllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter printWriter;
       
    public GetAllEmployeeServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	printWriter=response.getWriter();
	printWriter.println("Get All Employees");
	}

}
