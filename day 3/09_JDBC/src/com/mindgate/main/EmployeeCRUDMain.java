package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		int resultcount=0;
		String sqlQuery="";
		
		Connection connection;
		//Statement statement;
		PreparedStatement preparedStatement;
		ResultSet resultSet;
		
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, password);
//			sqlQuery="INSERT INTO employee_details(name,salary)VALUES(?,?)";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Jenny");
//			preparedStatement.setDouble(2, 405690);
//			resultcount=preparedStatement.executeUpdate();
//			connection.close();
//			if(resultcount > 0)
//			{
//				System.out.println("Record inserted successfully !!!");
//			}
//			else
//			{
//				System.out.println("Record not inserted");
//			}
			//statement=connection.createStatement();
//			sqlQuery="select * from employee_details";
//		    resultSet=statement.executeQuery(sqlQuery);
//		    
//		    while(resultSet.next())
//		    {
//		    	System.out.println(resultSet.getInt("employee_id"));
//		    	System.out.println(resultSet.getString("name"));
//		    	System.out.println(resultSet.getDouble("salary"));
//		    	System.out.println("-".repeat(50));
//
//		    }
//			connection.close();
//		} catch (ClassNotFoundException | SQLException e1) {
//			System.out.println("Exception");
//			System.out.println(e1.getMessage());
//		}
//		
//		System.out.println("Update example");
//		
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, password);
////			statement=connection.createStatement();
//			
//			sqlQuery="UPDATE employee_details SET name=?, salary=? where employee_id=?";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			
//			preparedStatement.setString(1, "Vini");
//			preparedStatement.setDouble(2, 999999);
//			preparedStatement.setInt(3, 5);
//			resultcount=preparedStatement.executeUpdate();
//			//resultcount=statement.executeUpdate(sqlQuery);
//			connection.close();
//			if(resultcount > 0) 
//				{
//					System.out.println("Record updated successfully");
//				}
//				else
//				{
//						System.out.println("Failed to update record");
//					
//				}
//			
//		} catch (ClassNotFoundException | SQLException e) 
//		{
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//			
//			
//		}
//		
//		
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			//statement=connection.createStatement();
			sqlQuery="DELETE employee_details where employee_id=?";
			preparedStatement=connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, 9);
			resultcount=preparedStatement.executeUpdate();
			connection.close();
			if(resultcount > 0) 
				{
					System.out.println("Record deleted successfully");
				}
				else
				{
						System.out.println("Failed to delete record");
					
				}
			} catch (ClassNotFoundException | SQLException e)
		{
			System.out.println("Exception");
			System.out.println(e.getMessage());
			
		}
		
		
		
//		System.out.println("Insert Example");
//		try {
//					Class.forName(driver);//driver will load in JVM.
//			connection=DriverManager.getConnection(url, user, password);//It will gives connection object
//			statement=connection.createStatement();//write query will be executed on connection.
//			sqlQuery="INSERT INTO employee_details(name,salary)VALUES('Chaitanya',10000)";//write query
//			resultcount=statement.executeUpdate(sqlQuery);//execute query
//			connection.close();
//			
//			if(resultcount > 0) 
//			{
//				System.out.println("Record inserted successfully");
//			}
//			else
//			{
//					System.out.println("Failed to add record");
//				
//			}
//		}
//			catch(ClassNotFoundException e | )
//			{
//				System.out.println("Exception");
//				System.out.println(e.getMessage());
//			}
	}	
		
	}


