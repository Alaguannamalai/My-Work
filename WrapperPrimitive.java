package com.tcs.training.example;

public class WrapperPrimitive {
public static void main(String args[]){
	//converting Integer to int
Integer ob = new Integer(5);
int i = ob.intValue();//converting integer into int
int j = ob.intValue();

System.out.println(ob+ " "+i+" "+j );
}
}
