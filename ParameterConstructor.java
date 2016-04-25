package com.tcs.training.example;

public class ParameterConstructor {
	int sso_id;
	String Employee_Name;
	
	ParameterConstructor(int i, String name){
		sso_id = i;
		Employee_Name = name;
	}
	public void user(){
		System.out.println(sso_id+ " = " +Employee_Name);
	}
	
	public static void main(String args[]){
		ParameterConstructor p =new ParameterConstructor(502334614, "AlaguAnnamalai");
		ParameterConstructor pc = new ParameterConstructor(502185637, "Prashant");
		p.user();
		pc.user();
	}

}
