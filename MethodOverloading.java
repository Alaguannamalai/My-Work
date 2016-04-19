package amazon;
//In this example, we have created two overloaded methods that differs in data type. The first sum method 
//receives two integer arguments and second sum method receives two double arguments.

public class MethodOverloading {

	int add(int a, int b){
		int c= a+b;
		System.out.println(c);
		return c;
	}
	
	double add(double m, double n, double p){
		double o = m+n+p;
		System.out.println(o);
		return o;
	}
	
	public static void main(String args[]){
		MethodOverloading ob = new MethodOverloading();
		ob.add(5, 5);
		ob.add(4.5, 5.5, 6.0);
	}
}
