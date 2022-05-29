package com.mindgate.main;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
		SortedSet<String> namSortedSet=new TreeSet<String>();
		
		namSortedSet.add("Rohit");
		namSortedSet.add("priyanka");
		namSortedSet.add("Aruna");
		namSortedSet.add("Ravina");
		namSortedSet.add("Komal");
		namSortedSet.add("Mahima");
		
		System.out.println(namSortedSet);
	}

}
