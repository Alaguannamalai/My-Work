package com.tcs.training.example;

import java.text.NumberFormat;
import java.util.Locale;

public class CommaSeparator {
public static void main(String args[]){
	int number = 1227500;
	 NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
	 String numberAsString = numberFormat.format(number);
	 System.out.println(numberAsString);
	}
}
