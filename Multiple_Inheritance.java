package amazon;

interface Readable{
	void read();
}

interface Showable{
	void show();
}

public class Multiple_Inheritance implements Readable, Showable{
	public void read(){
		System.out.println("Print the Printable");
	}
	
	public void show(){
		System.out.println("Show the Showable");
	}
	public static void main(String abcd[]){
		Multiple_Inheritance ob = new Multiple_Inheritance();
		ob.read();
		ob.show();
	}
}
