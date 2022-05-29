package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {

	public static void main(String[] args) {
		Set<String> namSet=new HashSet<String>();
		namSet.add("vivek");
		namSet.add("kiran");
		namSet.add("chaitanya");
		namSet.add("Nitesh");
		namSet.add("kiran");
		namSet.add("vivek");

		System.out.println(namSet);
		
		System.out.println("-".repeat(50));
		
		Employee employee1=new Employee(101, "vivek", 1000);
		System.out.println(employee1.hashCode());
		Employee employee2=new Employee(102, "chaitanya", 2000);
		System.out.println(employee2.hashCode());
		Employee employee3=new Employee(103, "kiran", 2000);
		System.out.println(employee3.hashCode());
		Employee employee4=new Employee(101, "vivek", 1000);
		System.out.println(employee4.hashCode());
		
		Set<Employee> empSet=new HashSet<Employee>();
		
		empSet.add(employee1);
		empSet.add(employee2);
		empSet.add(employee3);
		empSet.add(employee4);
		
		for (Employee employee : empSet) {
			System.out.println(employee);
		}
		
	}

}
