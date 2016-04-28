package amazon;

interface Printable{
	void print();
}

public class Interface implements Printable{
	public void print(){
		System.out.println("Print the method in Interface");
	}
	
public static void main(String argu[]){
	Interface ob = new Interface();
	ob.print();
}
}
