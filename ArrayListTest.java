package com.tcs.training.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
public static void main(String args[]){
	ArrayList<String> al = new ArrayList<String>();
	al.add("Manick");
	al.add("Vishnu");
	al.add("Arjun");
	al.add("Arvind");
	al.add("Mani");
  //al.add("Manick");
	
	Iterator itr = al.iterator();   //getting Iterator from arraylist to traverse elements
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	}
}
