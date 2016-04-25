package com.tcs.training.example;

public class ThisConstructorValue {
int sso_id;
String Name;
String city;

ThisConstructorValue(int sso_id, String Name){
	this.sso_id = sso_id;
	this.Name = Name;
}

ThisConstructorValue(int sso_id, String Name, String city){
	this(sso_id, Name);
	this.city = city;
}

void display(){
	System.out.println(sso_id+ " of " +Name+ " lives in " +city);
}
public static void main(String args[]){
	ThisConstructorValue e1 = new ThisConstructorValue(101, "Annamalai", "Mumbai");
	ThisConstructorValue e2 = new ThisConstructorValue(202, "Meyya", "Chennai");
	ThisConstructorValue e3 = new ThisConstructorValue(303, "Lakshmi", "Karaikudi");
	e1.display();
	e2.display();
	e3.display();
}
}
