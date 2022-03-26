package com.StringBufferAndStringBuilderMethods;

public class Append {

	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("Hello");
		
		System.out.println(name.append(" Everyone"));
		
		System.out.println("============");
		
		StringBuilder myName = new StringBuilder("Wel");
		 
		System.out.println(myName.append("come"));

	}

}
