package com.tcs.training.example;

public class ThisReturnAsStatementOfMethod {
	ThisReturnAsStatementOfMethod getThisReturnAsStatementOfMethod(){
		return this;
	}
	void msg(){
		System.out.println("Hello Java");
	}
		}
class Test{
	public static void main(String args[]){
		new ThisReturnAsStatementOfMethod().getThisReturnAsStatementOfMethod().msg();
	}
}
