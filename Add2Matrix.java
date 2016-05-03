package amazon;

//example that adds two matrices.

public class Add2Matrix {
public static void main(String argu[]){
	////creating two matrices  
	int[][] a ={{1,2,3}, {4,5,6}};
	int []b[] = {{1,2,3}, {4,5,6}};
	
	//creating another matrix to store the sum of two matrices  
	int c[][] = new int[2][3];
	
	for(int i=0; i<2; i++){
		for(int j=0; j<3; j++){
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+ " ");
		}
		System.out.println();
	}
	
}
}
