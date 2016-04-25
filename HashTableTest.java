package com.tcs.training.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
	public static void main(String args[]){
		//Hashtable takes the value in random order
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(80, "aasai");
		ht.put(20, "uzhaiphu");
		ht.put(50, "Latchiyam");
		ht.put(60, "Suyavelai");
		
	for(Map.Entry ob: ht.entrySet()){
		System.out.println(ob.getKey()+ " "+ob.getValue());
	}
	}

}
