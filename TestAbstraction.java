package amazon;

//Shape is the abstract class, its implementation is provided by
// the Rectangle and Circle classes

abstract class Shape{
	abstract void draw();
}

class Circle1 extends Shape{
	void draw(){
		System.out.println("Draw a Circle");
	}
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Draw a Rectangle");
	}
}

public class TestAbstraction {
	public static void main(String ops[]){
		Shape c = new Circle1();
		c.draw();
	}
}
