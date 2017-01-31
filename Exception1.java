package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//NOt handling the exception
class Sample {
	// instanc evariable
	private String name;

	// method to accept name
	void accept() throws IOException {
		// to accept data from keyboard
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name: ");
		//name = sc.next();
		name = br.readLine();
	}

	void display() {
		System.out.println("Name :" + name);
	}
}

public class Exception1  {
	public static void main(String args[]) throws IOException{
		Sample s = new Sample();
		s.accept();
		s.display();
	}

}
