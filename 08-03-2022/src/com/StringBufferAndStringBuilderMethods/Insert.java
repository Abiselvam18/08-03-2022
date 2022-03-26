package com.StringBufferAndStringBuilderMethods;

public class Insert {

	public static void main(String[] args) {
	
		StringBuffer name1 = new StringBuffer("Welcome to My Country");
		
		System.out.println(name1.insert(21, ", welcome to Chennai"));

		System.out.println("===================");
		
		StringBuffer name2 = new StringBuffer("Welcome India");
		
		System.out.println(name2.insert(8, "to ", 0, 3));
		
		StringBuffer name3 = new StringBuffer("Java ");
		
		System.out.println(name3.insert(5, "Programming ", 0, 12));//Programming

	}

}
