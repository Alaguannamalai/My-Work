package amazon;

//Inheritance should be used only if the relationship is-a is maintained 
// throughout the lifetime of the objects involved; otherwise, aggregation 
//  is the best choice.

public class Operation {
	int square(int n){
	return n*n;
	}
}

class Circle {
	Operation op; //aggregation
	double pi =3.14;
	
double area(int radius){
	op = new Operation();
	int rsquare = op.square(radius);
	return pi*rsquare;
}

public static void main(String argu[]){
	Circle c = new Circle();
	System.out.println("Area of a circle is " +c.area(5) );
}
}
