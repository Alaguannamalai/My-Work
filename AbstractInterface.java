package com.tcs.training.example;

interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A{
	public void c(){
		System.out.println("I am 'c' man");
	}
}

class Z extends B{
	public void a(){ System.out.println("I am a man");}
	public void b(){ System.out.println("I am b man");}
	public void d(){ System.out.println("I am d man");}
}

public class AbstractInterface {
	public static void main(String args[]){
		A ob = new Z();
		ob.a();
		ob.b();
		ob.c();
		ob.d();
	}

}
