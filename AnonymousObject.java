package amazon;

public class AnonymousObject {

	void fact(int n){
		int fac =1;

for(int i=1; i<=n; i++)
	fac = fac*i;
System.out.println("Factorial is: " +fac);
	}
	
public static void main(String args[]){
	new AnonymousObject().fact(5);
}
}
