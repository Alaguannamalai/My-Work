package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

 class Employee implements java.io.Serializable{
	public String name;
	public int sso;
	public String Domain;
	
	public void assignTask(){
		System.out.println("Assign a task to " +name+ "whose employee id is" +sso);
	}
}

public class Serialize {
	
	public static void main(String args[]) throws IOException{
		Employee em = new Employee();
		em.name = "Anna";
		em.sso = 502334614;
		em.Domain = " Java";
		
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(em);
		out.flush();
		System.out.println("Success");
		
	}

}
