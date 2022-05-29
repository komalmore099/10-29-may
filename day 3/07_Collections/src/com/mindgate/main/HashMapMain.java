package com.mindgate.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		Map<Integer,String> employeeMap=new HashMap<Integer,String>();
		
		employeeMap.put(101, "komal");
		employeeMap.put(103, "mahima");
		employeeMap.put(102, "rohan");
		
		System.out.println(employeeMap);

	}

}
