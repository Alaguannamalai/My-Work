package com.tcs.training.collections;

import java.util.ArrayList;

public class ArrayListForLoop {
public static void main(String args[]){
	ArrayList<String> al = new ArrayList<String>();
	al.add("Manick");
	al.add("Vishnu");
	al.add("Arjun");
	al.add("Arvind");
	al.add("Mani");
	
	for(String obj: al)
		System.out.println(obj);
}
}
