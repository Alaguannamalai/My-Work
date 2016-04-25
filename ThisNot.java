package com.tcs.training.example;

public class ThisNot {
	int sso;
	String Name;
	
	ThisNot(int sso, String Name){
		this.sso = sso;
		this.Name = Name;
	}

	void display(){
		System.out.println(sso+ "=" +Name);
	}
	public static void main(String args[]){
	ThisNot s1 = new ThisNot(502, "Anna");
	ThisNot s2 = new ThisNot(501, "Muk");
	s1.display();
	s2.display();
	}
}
