package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter printWriter;
	private String id;
	private String password;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		printWriter=response.getWriter();
		id=request.getParameter("txtLoginID");
		password=request.getParameter("txtpassword");
		
		if(id.equals("admin") && password.equals("admin@123"))
		{
			response.sendRedirect("suuccess.html");
		}
		else
		{
           response.sendRedirect("Failure.html");
		}
	}

}
