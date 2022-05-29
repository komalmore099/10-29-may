package com.mindgate.main;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		SortedMap<Integer, String> empMap=new TreeMap<Integer, String>();
		
		empMap.put(10, "pravin");
		empMap.put(111, "atul");
		empMap.put(8, "pihu");
		empMap.put(107, "priya");
		
		System.out.println(empMap);

	}

}
