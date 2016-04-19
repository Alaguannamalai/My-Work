package amazon;

public class ConstructorOverloading {
	int std_id;
	String name;
	int age;
	
	ConstructorOverloading(int a, String b, int c){
		std_id = a;
		name = b;
		age = c;
	}
	
	ConstructorOverloading(int c, String b){
		name = b;
		age = c;
	}
	
	void display(){
		System.out.println(name +" is " +age +" years old " +"and id is " +std_id );
	}
	
	public static void main(String argh[]){
		ConstructorOverloading ob1 = new ConstructorOverloading(901, "Anna", 23);
		ConstructorOverloading ob2 = new ConstructorOverloading(22, "Aravind");
		ob1.display();
		ob2.display();
	}

}
