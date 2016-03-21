package com.tcs.training.array;

//We can copy an array to another by the arraycopy method of System class.

public class ArrayCopy {

	public static void main(String args[]) {
		char[] copyFrom = { 'a', 's', 'h', 'e', 'e', 'p', 'd', 'o', 'l', 'l',
				'y' };
		char[] copyTo = new char[5];

		System.arraycopy(copyFrom, 6, copyTo, 0, 5);
		System.out.println(new String(copyTo));
	}
}
