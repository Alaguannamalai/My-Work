package com.tcs.training.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
	int EmpId;
	String Name;
	int age;
	String Role;

	Employee(int EmpId, String Name, int age, String Role) {
		this.EmpId = EmpId;
		this.Name = Name;
		this.age = age;
		this.Role = Role;
	}
}

public class ArrayListUserDefined {
	public static void main(String args[]) {
		// create user defined class objects
		Employee e1 = new Employee(757856, "AlaguAnnamalai", 23,
				"Assistant system Engineer");
		Employee e2 = new Employee(231537, "Roopesh", 34, "Project Leader");
		Employee e3 = new Employee(161106, "Ankit Gupta", 34, "Project Manager");
		Employee e4 = new Employee(141079, "Giri", 39, "Account Manager");

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		Iterator itr = al.iterator();
		// traversing elements of arraylist objects
		while (itr.hasNext()) {
			Employee emp = (Employee) itr.next();
			System.out.println(emp.EmpId + " " + emp.Name + " is " + emp.age
					+ " Years old " + " and working as " + emp.Role);
		}

	}
}
