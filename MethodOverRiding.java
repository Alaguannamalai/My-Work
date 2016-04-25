package com.tcs.training.example;

public class MethodOverRiding {
	public void KaraiKudi(){
		System.out.println("KaraiKudi belongs to Madurai District");
	}
}

class Kottaiyur{
	public void Karaikudi(){
		System.out.println("Kottaiyur belongs to SivaGangai District");
	}
}

class Valaiyapatti{
	public static void main(String args[]){
		Kottaiyur ob = new Kottaiyur();  //Run the main method, which runs the method in Kottaiyur Class
		ob.Karaikudi();
	}
}