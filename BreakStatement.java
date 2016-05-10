package amazon;

public class BreakStatement {

	public static void main(String argd[]){
		int numbers[] = {10, 20, 30, 40, 50};
		
		for(int x : numbers){
			if(x == 30)
				break;
			
			System.out.println(x);
		}
	}
}
