package amazon;

public class ContinueStatement {

	public static void main(String args[]){
		int yens[] = {5, 15, 25, 35, 45 ,50, 55, 65, 75};
		
		for(int x : yens){
			if(x==50)
				continue;
			System.out.println(x);
		}
	}
	
}
