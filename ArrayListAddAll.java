package com.tcs.training.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAll {
public static void main(String args[]){
	ArrayList<String> al = new ArrayList<String>();
	al.add("Pratik");
	al.add("Govinda");
	al.add("Aditya");
	al.add("Gaurav");
	al.add("Deepak");
	
	ArrayList<String> a2 = new ArrayList<String>();
	a2.add("Shipra");
	a2.add("Neha");
	a2.add("Swetha");
	a2.add("Govinda");
	
	//al.addAll(a2);
	//al.removeAll(a2);
	al.retainAll(a2);
	
	Iterator itr = al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	}
}
