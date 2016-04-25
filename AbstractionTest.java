package com.tcs.training.example;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Draw a rectangle");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Draw a circle");
	}
}

public class AbstractionTest {
public static void main(String args[]){
	Shape s= new Rectangle();
	Shape s1 = new Circle();
	s.draw();
	s1.draw();
}
}
