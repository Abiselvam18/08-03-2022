package com.StringBufferAndStringBuilderMethods;

public class Replace {

	public static void main(String[] args) {

		StringBuffer colour = new StringBuffer("White");
		
		System.out.println(colour);
		
		System.out.println(colour.replace(0, 6, "Blue"));
		
	}

}
