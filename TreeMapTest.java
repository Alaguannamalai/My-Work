package com.tcs.training.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String args[]) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(15, "Star");
		tm.put(20, "maintenance");
		tm.put(30, "Final");
		tm.put(10, "Learn");

		for (Map.Entry ob : tm.entrySet()) {
			System.out.println(ob.getKey() + " " + ob.getValue());
		}
	}

}
