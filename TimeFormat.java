package com.tcs.training.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
public static void main(String args[]){
	Date date = new Date();
	String strDateFormat = "HH:mm:ss a";
	SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	System.out.println(sdf.format(date));
}
}
