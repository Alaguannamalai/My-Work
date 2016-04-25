package com.tcs.training.example;

class ThisConstructor{  
    int id;  
    String name;
    static String College = "MKCE";
    
    static void change(){
    	College = "IIT";
    }
    
    ThisConstructor(){
    System.out.println("default constructor is invoked");
    }  
    
    ThisConstructor(int id,String name){  
    this ();//it is used to invoked current class constructor.  
    this.id = id;  
    this.name = name;  
    }  
    void display(){
    	System.out.println(id+" "+name+ " Studied from " +College);
    	}  
      
    public static void main(String args[]){  
    	ThisConstructor.change();
    ThisConstructor e1 = new ThisConstructor(111,"Anna");  
    ThisConstructor e2 = new ThisConstructor(222,"Rhishi");  
    ThisConstructor e3 = new ThisConstructor(333, "Muk");
    e1.display();  
    e2.display();
    e3.display();
    e3.display();
   }  
} 
