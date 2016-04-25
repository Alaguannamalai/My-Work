package com.tcs.training.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
	public static void main(String args[]) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		// LinkedHasMap also can have one null key and many null values
		// It maintains insertion order

		lhm.put(901, "Alagu");
		lhm.put(902, null);
		lhm.put(903, "Arul Jothi");
		lhm.put(null, "Ashok");
		lhm.put(null, null);

		for (Map.Entry mp : lhm.entrySet()) {
			System.out.println(mp.getKey() + " " + mp.getValue());
		}
	}

}
