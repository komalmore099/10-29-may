package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArrayListDemo;
import com.mindgate.pojo.Employee;

public class ArrayListMain {

	public static void main(String[] args) {
		ArrayListDemo arrayListDemo=new ArrayListDemo();
		List<String> namList=new ArrayList<String>();
		
		namList.add("komal");
		namList.add("Vivek");
		namList.add("Mahi");
				
		arrayListDemo.setArrayListId(10);
		
		arrayListDemo.setNameList(namList);//values goes to object not to class
	
	System.out.println(arrayListDemo);
	System.out.println("-".repeat(50));
	
	List<Integer> numbeList =new ArrayList<Integer>();
	numbeList.add(101);
	numbeList.add(102);
	numbeList.add(103);
	
	System.out.println(numbeList);
	
	System.out.println("-".repeat(50));
	
	Employee employee1=new Employee(101,"vivek",1000);
	Employee employee2=new Employee(102,"reema",1000);
	Employee employee3=new Employee(101,"vivek",1000);
	Employee employee4=new Employee(103,"seema",1000);
	List<Employee> emList=new ArrayList<Employee>();
	
	emList.add(employee1);
	emList.add(employee2);
	emList.add(employee1);
	emList.add(employee4);
	
	System.out.println(emList);
	System.out.println("-".repeat(50));
	for (Employee employee : emList) {
		System.out.println(employee);
	}
	
	}

}
