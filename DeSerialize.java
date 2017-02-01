package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize {
	public static void main(String args[])throws Exception{
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		Employee em = (Employee)in.readObject();
		System.out.println(em.sso+ " is "+ em.name);
		
		in.close();
	}

}
