package amazon;

public class Student2 {
	int std_id;
	String name;
	
	void insertRecord(int a, String b){
		std_id = a;
		name = b;
	}
	
	void displayInformation(){
		System.out.println(std_id +" = " +name);
	}
	
	public static void main(String args[]){
		Student2 ob = new Student2();  //ob, ob1, ob2 will be stored in STACK MEMORY
		Student2 ob1 = new Student2();
		Student2 ob2 = new Student2();
		ob.insertRecord(901, "AlaguAnnamalai"); //(901, AlaguAnnamalai) will be stored in HEAP MEMORY
		ob1.insertRecord(902, "Aravind");
		ob2.insertRecord(903, "Yeshwanth");
		
		ob.displayInformation();
		ob1.displayInformation();
		ob2.displayInformation();
	}
}
