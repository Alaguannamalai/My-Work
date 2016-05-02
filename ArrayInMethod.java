package amazon;

public class ArrayInMethod {
	static void min(int arr[]) {
		int mini = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (mini > arr[i])
				mini = arr[i];
		}
		System.out.println(mini);
	}

	public static void main(String fogs[]) {
		int a[]={20,06,1962};
		min(a);
	}
}
