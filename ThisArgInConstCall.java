package com.tcs.training.example;

public class ThisArgInConstCall {
Alpha obj;
ThisArgInConstCall(Alpha obj){
	this.obj = obj; 
}
void display()
{
	System.out.println(obj.data);
}
}

class Alpha{
	int data =10;
	Alpha(){
	ThisArgInConstCall b = new ThisArgInConstCall(this);
	b.display();
	}
	public static void main(String args[]){
		Alpha c = new Alpha();
	}
}
