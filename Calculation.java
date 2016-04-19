package amazon;

//In this example, we have created two overloaded methods,
//first sum method performs addition of two numbers and second sum method 
//performs addition of three numbers.

public class Calculation {
 void add(int a, int b){
	 int c = a+b;
	 System.out.println(c);
 }
 
 void add(int i, int j, int k){
	 int l = i+j+k;
	 System.out.println(l);
 }
 
 public static void main(String args[]){
	 Calculation ob = new Calculation();
	 ob.add(3, 4);
	 ob.add(5, 5, 3);
 }
}



