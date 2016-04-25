package com.tcs.training.example;

public class ConstructorOverloading {
	int sso_id, age;
	String Employee_Name;
	
ConstructorOverloading(int i, int g, String name){
	sso_id = i;
	age = g;
	Employee_Name = name;
}
	
ConstructorOverloading(int j,String peyar){
	sso_id = j;
	Employee_Name = peyar; 
}

void display(){
	System.out.println(sso_id+ " " +Employee_Name+ " where age is:" +age );
}
public static void main(String args[]){
	ConstructorOverloading s1 = new ConstructorOverloading(502334614, 23, "Anna");
	ConstructorOverloading s2 = new ConstructorOverloading(502334611, "Srishti");
	s1.display();
	s2.display();
}

}
