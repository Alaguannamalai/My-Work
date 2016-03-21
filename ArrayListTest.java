package com.tcs.training.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<String> listA = new ArrayList<String>();

		// add() calls add a String instance to the end of the lis
		listA.add("element 1");
		listA.add("element 2");
		listA.add("element 3");
		// add() call adds a String at index 0
		listA.add(0, "element 0");

		// number of elements in the List by calling the size() method
		System.out.println("Size of the ArrayList is: " + listA.size());

		// access via index
		System.out.println("Accessing list via INDEX: ");
		String element0 = listA.get(0);
		String element2 = listA.get(2);

		System.out.println("Element 0 is: " + element0);
		System.out.println("Element 2 is: " + element2);

		// access via iterator
		System.out.println("Accessing list via ITERATOR: ");
		Iterator iterator = listA.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println("The Iterator List is: " + element);
		}

		// access via advanced for loop
		System.out.println("Accessing list via ADVANCED FOR LOOP");
		for (String element : listA) {
			System.out.println(element);
		}

		// access via for loop
		System.out.println("Accessing list via FOR LOOP");
		for (int i = 0; i < listA.size(); i++) {
			System.out.println(listA.get(i));
		}

	}

}
