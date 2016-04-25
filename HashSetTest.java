package com.tcs.training.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String args[]) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Anna");
		hs.add("Gowtham");
		hs.add("Mukesh");
		hs.add("Arvind");
		hs.add("Mukesh");

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

//Has set maintains no order 
//LinkedHashSet maintains Insertion order
//TreeSet maintains ascending order
