package com.sathyatech.app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleDate {

	public static void main(String[] args) {

		SimpleDateFormat f = new SimpleDateFormat(
				"EEE MMM d h:mm:ss a z yyyy");
		
		System.out.println(f.format(new Date()));

	}
}
