package amazon;

//Inheritance in java is a mechanism in which one 
// object acquires all the properties and behaviors of parent object.

public class Employee {
	float salary = 30000;
}

class Programmer extends Employee {
	int bonus = 7700;

	public static void main(String argi[]) {
		Programmer p = new Programmer();
		System.out.println("Salary of Employee is " + p.salary);
		System.out.println("Bonus of Progrmmer is " + p.bonus);
	}
}
