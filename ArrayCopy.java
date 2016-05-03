package amazon;

public class ArrayCopy {
	public static void main(String arga[]) {
		char[] copyFrom = { 'A', 'n', 'n', 'a', 'm', 'a', 'l', 'a', 'i' };

		char[] copyTo = new char[4];

		System.arraycopy(copyFrom, 0, copyTo, 0, 4);
		System.out.println(new String(copyTo));
	}

}
