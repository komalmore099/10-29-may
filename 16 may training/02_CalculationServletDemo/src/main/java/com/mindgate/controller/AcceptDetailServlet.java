package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AcceptDetailServlet")
public class AcceptDetailServlet extends HttpServlet {
	private PrintWriter printWriter;
	private double num1;
	private double num2;
	private double Result;
       
   
    public AcceptDetailServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		printWriter=response.getWriter();
		
		num1=Double.valueOf(request.getParameter("txtuserNumber1"));
		num2=Double.valueOf(request.getParameter("txtuserNumber2"));
		
		Result=num1+num2;
		
		printWriter=response.getWriter();
		printWriter.println("Addition of " + num1 + " and " + num2 + "=" + Result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
