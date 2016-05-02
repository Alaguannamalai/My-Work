package amazon;

//Instance variable of current class is refered by instance bydefault, 
// but I have to refer parent class instance variable that is why we use 
//  super keyword to distinguish between parent class instance variable and 
//   current class instance variable.

public class Vehicle {
	int speed = 50;
}

class Tempo extends Vehicle{
	int speed = 100;
	
void display(){
	System.out.println("Speed in Km/Hr :" +super.speed);
	System.out.println("Speed in Km/Hr :" +speed);
}

public static void main(String ambi[]){
	Tempo ob = new Tempo();
	ob.display();
}
}
