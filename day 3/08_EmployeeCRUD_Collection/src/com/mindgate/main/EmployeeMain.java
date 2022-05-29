package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee;
		boolean result;
		String continueChoice;
		EmployeeDAO edao=new EmployeeDAO();
		Scanner scanner=new Scanner(System.in);
		do {
		System.out.println("Menu");
		System.out.println("1.Add new Employee");
		System.out.println("2.Update existing Employee");
		System.out.println("3.Delete EMployee by ID");
		System.out.println("4.Get single employee details");
		System.out.println("5.Get all Employees details");
		
		System.out.println("Enter your choice");
		int choice=scanner.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter employee ID");
			int id=scanner.nextInt();
			System.out.println("Enter employee name");
			String name=scanner.next();
			System.out.println("Enter employe salary");
			double salary=scanner.nextDouble();
			
			employee=new Employee(id, name, salary);
			result=edao.addnewEmployee(employee);
			if(result)
			{
				System.out.println("Emloyee added successfully");
				System.out.println();
			}
			else {
				System.out.println("Failed to add added");
			}
			break;
			
		case 2:
			System.out.println("Enter ID");
			int ID=scanner.nextInt();
			System.out.println("Enter new name");
			String nm=scanner.next();
			System.out.println("Enter new salary");
			double sal=scanner.nextDouble();
			employee=new Employee(ID, nm, sal);
			result=edao.updateEmployee(employee);
			
			if(result)
			{
				System.out.println("Emloyee Updated successfully");
				System.out.println();
			}
			else {
				System.out.println("Failed to Updated employee");
			}
			break;
			
		case 3:
			System.out.println("Enter ID");
			int Id=scanner.nextInt();
			
			result=edao.deleteEmployeeByID(Id);
			
			if(result)
			{
				System.out.println("Emloyee deleted successfully");
				System.out.println();
			}
			else {
				System.out.println("Failed to delete employee");
			}
			break;
		case 4:
			System.out.println("Enter ID");
			int eid=scanner.nextInt();
			

			System.out.println(edao.getEmployeeByEmployeeID(eid));
			break;
			
		case 5:
			System.out.println(edao.getAllEmployees());
			break;
		default:
			   System.out.println("Invalid choice");	
		}

		System.out.println("Do you want to continue?");
		continueChoice=scanner.next();
	}while(continueChoice.equals("yes"));
	System.out.println("Thank you for Banking with us...");
	

	}

}
