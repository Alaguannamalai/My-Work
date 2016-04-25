package com.tcs.training.example;

public class FinalMethod {
   /*final */ void drift(){
		System.out.println("Drift means to blown into heaps by wind");
	//final method once written cannot be over ridden	
	}
}
	class NewClass extends FinalMethod{
		void drift(){
			System.out.println("Shift is to replace from from one to another");
		}
	
	public static void main(String args[]){
		FinalMethod ob1 = new FinalMethod();
		ob1.drift();
		//new NewClass().drift();
		//It works in this for inheriting the final method
	}
}
