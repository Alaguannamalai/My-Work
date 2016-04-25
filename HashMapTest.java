package com.tcs.training.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String args[]) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Nandha");
		hm.put(99, "Dharani");
		hm.put(98, "Anna");
		hm.put(97, "Kathir");
		hm.put(null, "Karthik");
		// Hash Map can have one null key and many null values

		if (!hm.isEmpty()) {
			/* Displaying all keys */
			System.out.println("HashMap Keys: " + hm.keySet());
			/* Displaying all the values */
			System.out.println("HashMap Values: " + hm.values());

			for (Map.Entry m : hm.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
		}

	}

}
