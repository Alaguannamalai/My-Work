package com.tcs.training.example;

public class MethodOverRidingBank {
 int getRateOfInterest(){
	return 0;
	}
}

class HDFC extends MethodOverRidingBank{
	 int getRateOfInterest(){
		return 18;
	}
}

class IndianBank extends MethodOverRidingBank{
	int getRateOfInterest(){
		return 13;
	}
}

class LVB extends MethodOverRidingBank{
	int getRateOfInterest(){
		return 11;
	}
}

class EducationLoan{
	public static void main(String args[]){
		HDFC o1 = new HDFC();
		IndianBank o2 = new IndianBank();
		LVB o3 = new LVB();
		System.out.println("EduLoan Interest in HDFC: " +o1.getRateOfInterest());
		System.out.println("EduLoan Interest in IndianBank: " +o2.getRateOfInterest());
		System.out.println("EduLoan Interest in LVB: " +o3.getRateOfInterest());
	}
}
