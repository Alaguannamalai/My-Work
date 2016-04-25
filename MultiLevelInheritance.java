package com.tcs.training.example;

public class MultiLevelInheritance {
String name="Kanna";
int Emp_id;
}

class Data extends MultiLevelInheritance {
	static String College = "MKCE";
	double salary = 32583.33;
}
class Tiles extends Anna{
	int tcs =50000;
}

 class Profile extends Tiles{
	 public static void main(String args[]){
		 Profile ob1 = new Profile();
		// System.out.println("Student:" +ob.name+ " has"
		 //		+ " studied from: " +Data.College+ " and earns monthly:" +ob.salary);
		 System.out.println("Its a try from other class:" +ob1.appa);
	 }
 }
 