package com.tcs.training.example;

public class FinalVariable {
	/*final */ int appasalary=25000;
	//Using the final Variable give you a compile time error for next usuage 
	
	void Velocity(){
		appasalary = 30000;
	}
 public static void main(String args[]){
	 FinalVariable ob = new FinalVariable();
	 ob.Velocity();
 }
}

//blank or uninitialized final variable and it can be initialized only in constructors
/*class Bike10{  
  final int speedlimit;//blank final variable  
    
  Bike10(){  
  speedlimit=70;  
  System.out.println(speedlimit);  
  }  
  
  public static void main(String args[]){  
    new Bike10();  
 }  
}  */


//static blank final variable and it can be initialized only in static block
/* class A{  
  static final int data;//static blank final variable  
  static{ data=50;}  
  public static void main(String args[]){  
    System.out.println(A.data);  
 }  
}  */

